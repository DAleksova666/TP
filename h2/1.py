# coding: latin-1
#Училище - Технологично училище „Електронни системи” към Технически университет – София
#Клас - 11Б
#Номер - 12
#Име - Даниела Алексова
#Задача - Програма,която събира числата в дадена колона на csv файл.
import csv
file_handle = open('test.csv','rb')
reader = csv.reader(file_handle, delimiter=',', quotechar='|')


i=0
n=0
o=0


for row in reader:
	for i in range(len(row)):
		if row[i]=="Grade":
			p=i

file_handle.seek(0)


for row in reader:
	if row[p].isdigit()==1:
		n=n+int(row[p])

print "The sum is:",n

file_handle.close()



