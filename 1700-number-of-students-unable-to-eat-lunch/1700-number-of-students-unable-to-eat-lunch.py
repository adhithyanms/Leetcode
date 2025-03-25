class Solution:
    def countStudents(self, students: List[int], sandwiches: List[int]) -> int:
        eated_count=0
        while students:
            if students[0]==sandwiches[0]:
                students.pop(0)
                sandwiches.pop(0)
                eated_count=0
            else:
                students.append(students.pop(0))
                eated_count+=1
            if eated_count==len(students):
                break

        return len(students)
        