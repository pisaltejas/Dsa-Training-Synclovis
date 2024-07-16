def print2largest(arr, arr_size):
    if arr_size < 2:
        print("Array must have at least two elements")
        return
    arr.sort(reverse=True)
    for i in range(1, arr_size):
        if arr[i] != arr[0]:
            print("The second largest element is", arr[i])
            return
    print("There is no second largest element")

arr = [15, 42, 8, 23, 42, 7]
n = len(arr)
print2largest(arr, n)
