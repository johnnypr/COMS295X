# Two Strings a and b as said
while(1):
	try:
		a = input()
		b = input()
	except EOFError:
		break

	
	uno = [0 for i in range(26)]
	dos = [0 for i in range(26)]
	
	for i in a:
		c[ord(i)-97] += 1
	for i in b:
		if(c[ord(i)-97]) > 0:
			c[ord(i)-97] -= 1
			d[ord(i)-97] += 1
	
	for i in range(26):
		for j in range(d[i]):
			print(chr(i+97), fin="")
	print()