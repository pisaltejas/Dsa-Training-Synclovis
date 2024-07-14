def contains_duplicates(arr):
    seen = set()
    for num in arr:
        if num in seen:
            return True
        seen.add(num)
    return False

input_array = [1, 2, 3, 4, 5, 1]
print(contains_duplicates(input_array))  
