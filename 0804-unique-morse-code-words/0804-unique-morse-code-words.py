class Solution:
    def uniqueMorseRepresentations(self, words: List[str]) -> int:
        morse_code = [
                ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..",
                ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.",
                "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."
            ]
        unquie_transformation=set()
        for word in words:
            current=''.join(morse_code[ord(char)-ord('a')] for char in word)
            unquie_transformation.add(current)
        return len(unquie_transformation)
            