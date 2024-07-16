def compress_string(s):
    if not s:
        return s



compressed = []
count = 1
current_char = s[0]

for i in range(1, len(s)):
    if s[i] == current_char:
        count += 1
    else:
        compressed.append(current_char)
        if count > 1:
            compressed.append(str(count))
        current_char = s[i]
        count = 1

# Add the last character and its count
compressed.append(current_char)
if count > 1:
    compressed.append(str(count))

compressed_string = ''.join(compressed)
return compressed_string if len(compressed_string) < len(s) else s
input_string = "aabcccccaaa"
print(compress_string(input_string))  # Output: "a2bc5a3"
