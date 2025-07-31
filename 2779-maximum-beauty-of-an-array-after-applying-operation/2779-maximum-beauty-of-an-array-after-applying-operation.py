class Solution:
    def maximumBeauty(self, values: list[int], tolerance: int) -> int:
        # Create events to represent the start and end of ranges
        timeline = []
        for val in values:
            timeline.append((val - tolerance, 1))  # Start of the range
            timeline.append((val + tolerance + 1, -1))  # End of the range (exclusive)

        # Sort the timeline events by position, prioritizing start events in ties
        timeline.sort()

        # Use a sweeping line algorithm to find the maximum overlap
        peak_beauty = 0
        active_ranges = 0
        for position, change in timeline:
            active_ranges += change
            peak_beauty = max(peak_beauty, active_ranges)

        return peak_beauty
