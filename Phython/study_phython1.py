Python 3.4.1 (v3.4.1:c0e311e010fc, May 18 2014, 10:38:22) [MSC v.1600 32 bit (Intel)] on win32
Type "copyright", "credits" or "license()" for more information.
>>> a=3
>>> b=4
>>> c=a+b
>>> c
7
>>> print(a)
3
>>> "\"Yes,\" hed said."
'"Yes," hed said.'
>>> '"isn\'t,"she said.'
'"isn\'t,"she said.'
>>> 
'spam eggs'  # single quotes
'spam eggs'
>>> 'doesn\'t'  # use \' to escape the single quote...
"doesn't"
>>> "doesn't"  # ...or use double quotes instead
"doesn't"
>>> '"Yes," he said.'
'"Yes," he said.'
>>> "\"Yes,\" he said."
'"Yes," he said.'
>>> '"Isn\'t," she said.'
'"Isn\'t," she said.'

SyntaxError: multiple statements found while compiling a single statement
>>> 'spam eggs'  # single quotes

'spam eggs'
>>> 'doesn\'t'  # use \' to escape the single quote...
"doesn't"
>>> "doesn't"  # ...or use double quotes instead

"doesn't"
>>> '"Yes," he said.'

'"Yes," he said.'
>>> "\"Yes,\" he said."

'"Yes," he said.'
>>> "Isn\'t," she said.'

SyntaxError: invalid syntax
>>> 3*'faiz'
'faizfaizfaiz'
>>> 3*'faiz '
'faiz faiz faiz '
>>> 'faiz' 'faizal'
'faizfaizal'
>>> name="faizfaizal"
>>> name[-1]
'l'
>>> name[-2]
'a'
>>> name[0:2]
'fa'
>>> name[:7]
'faizfai'
>>> this = "phython"
>>> "sh" + this[:2]
'shph'
>>> "sh" + this[2:]
'shython'
>>> myname="faiz"
>>> myfather="faizal"
>>> myname + myfather
'faizfaizal'
>>> myname +" "+myfather
'faiz faizal'
>>> squres = "1,4,9,16,25"
>>> squares
Traceback (most recent call last):
  File "<pyshell#30>", line 1, in <module>
    squares
NameError: name 'squares' is not defined
>>> squres
'1,4,9,16,25'
>>> squres[:]
'1,4,9,16,25'
>>> bentuk = [bulat,bujur]
Traceback (most recent call last):
  File "<pyshell#33>", line 1, in <module>
    bentuk = [bulat,bujur]
NameError: name 'bulat' is not defined
>>> bentuk = ["bulat","bujur"]
>>> bentuk+["segitiga","segiempat"]
['bulat', 'bujur', 'segitiga', 'segiempat']
>>> bentuk.append(216)
>>> bentuk[2:]
[216]
>>> bentuk = ["bulat","bujur"]
>>> bentuk = ["bulat","bujur","segitiga","segiempat"]
>>> bentuk
['bulat', 'bujur', 'segitiga', 'segiempat']
>>> newname=['f','a','i','z']
>>> newlist[bentuk,newname]
Traceback (most recent call last):
  File "<pyshell#42>", line 1, in <module>
    newlist[bentuk,newname]
NameError: name 'newlist' is not defined
>>> newlist=[bentuk,newname]
>>> newlist
[['bulat', 'bujur', 'segitiga', 'segiempat'], ['f', 'a', 'i', 'z']]
>>> newlist[0][1]
'bujur'
>>> a, b = 0, 1

>>> while b < 10:
	print(b)
 a, b = b, a+b

SyntaxError: unindent does not match any outer indentation level
>>> while b < 10:
	print(b)
	a, b = b, a+b

	
1
1
2
3
5
8
>>> b = 10:
	
SyntaxError: invalid syntax
>>> b = 10
>>> while
SyntaxError: invalid syntax
>>> b = 0
>>> while b < 10
SyntaxError: invalid syntax
>>> while b < 10:
	print("faiz")
	b = b + 1

	
faiz
faiz
faiz
faiz
faiz
faiz
faiz
faiz
faiz
faiz
>>> homework = "madam suruh baca manual dan buat tengok soalan phython untuk pyq masing masing kalau ade nanti bincang dengan kawan-kawan"
>>> homework
'madam suruh baca manual dan buat tengok soalan phython untuk pyq masing masing kalau ade nanti bincang dengan kawan-kawan'
>>> 
