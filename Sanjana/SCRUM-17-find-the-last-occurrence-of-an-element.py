def find_last_occurrence(lst, element):
    for i in range(len(lst) - 1, -1, -1):
        if lst[i] == element:
            return i
    return -1  # Element not found

# Example usage
lst = [1, 2, 3, 2, 4, 5, 2]
element_to_find = 2
last_index = find_last_occurrence(lst, element_to_find)

if last_index != -1:
    print(f"Last occurrence of {element_to_find} is at index: {last_index}")
else:
    print(f"{element_to_find} not found in the list.")
