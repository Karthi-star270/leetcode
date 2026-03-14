class Solution:
    def isValid(self, s: str) -> bool:
        bracket_map = {')': '(', '}': '{', ']': '['}
        stack = []   
        for char in s:
            if char in bracket_map:
                top_element = stack.pop() if stack else '#' 
                if bracket_map[char] != top_element: 
                    return False
            else: 
                stack.append(char)
        return not stack 
sol = Solution()
print(sol.isValid("()"))      # Output: True
print(sol.isValid("()[]{}"))  # Output: True
print(sol.isValid("(]"))      # Output: False
print(sol.isValid("([])"))    # Output: True
print(sol.isValid("([)]"))    # Output: False
