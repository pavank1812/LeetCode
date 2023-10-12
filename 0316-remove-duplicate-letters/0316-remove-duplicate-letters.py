class Solution:
    def removeDuplicateLetters(self, s: str) -> str:
        stack = []
        seen = set()
        last_occurrence = {}

        for i, char in enumerate(s):
            last_occurrence[char] = i

        for i, char in enumerate(s):
            if char not in seen:
                while stack and char < stack[-1] and i < last_occurrence[stack[-1]]:
                    seen.remove(stack.pop())
                stack.append(char)
                seen.add(char)

        return ''.join(stack)
