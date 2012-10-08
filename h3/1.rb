#Училище - Технологично училище „Електронни системи” към Технически университет – София
#Клас - 11Б
#Номер - 12
#Име - Даниела Алексова
#Задача - Програма,която събира числата в дадена колона спрямо стойностите на друга колона в един csv файл.

require "csv"


def process_file_with_csv
res=0
res2=0
res3=0
CSV.foreach("test2.csv" ) do |row|

	if row[2]=="Ruby"
	res+= row[1].to_i
	end

	if row[2]=="Python"
	res2+= row[1].to_i
	end

	if row[2]=="Perl"
	res3+= row[1].to_i
	end
end
print ("The sum of the numbers of Ruby programmers is:")
p res
print ("The sum of the numbers of Python programmers is:")
p res2
print ("The sum of the numbers of Perl programmers is:")
p res3
end
process_file_with_csv
