#Училище: Технологично училище "Електронни системи" към Технически Университет - София
#Клас: 11 Б
#Номер: 12
#Име: Даниела Яворова Алексова
#Задача: Да се направи Reverse Polish Notation(RPN) Calculator.

class Calc
list = Array.new
ARGV.each do |a|
	
	if a.to_s == "+" 
		x = list.last
		list.pop
		y = list.last
		list.pop
		c = x+y
		list.push c
	elsif a.to_s == "-" 
		x = list.last
		list.pop
		y = list.last
		list.pop
		c = x-y
		list.push c
	else 
		
		list.push a.to_i		

	end
	
end
puts "The result is" , list.last


end


