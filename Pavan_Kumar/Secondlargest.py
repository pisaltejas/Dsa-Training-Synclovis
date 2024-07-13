size = int(input("Enter the number of element: "))
arr=[]
print("Enter",size,"numbers:")
for i in range (0,size):
    ele= int(input())
    arr.append(ele)
arr.sort()
large = arr[-1]
for i in range (-1,-size,-1):
    if arr[i]!=large:
        print("Second largest element is: ",arr[i])
        break