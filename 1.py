
def calculateProduct(lol):
	product = 1
	for i in lol:
		product *= i
	return product


n = int(input())
op = []
for z in range(n):
	count = 0
	temp = input().split(" ")
	vS = int(temp[0])
	k = int(temp[1])
	arr = []
	a = input().split(" ")
	for j in range(vS):
		arr.append(int(a[j]))
	for i in range(vS):
		for j in range(i+1,vS+1):
			if calculateProduct(arr[i:j]) < k:
				count += 1
	op.append(count)


for i in op:
	print(i)
