#Училище: Технологично училище "Електронни системи" към Технически Университет - София
   #Клас: 11 Б
   #Номер: 12
   #Име: Даниела Яворова Алексова
   #Задача: Програма, която прави автоматична подредба на пътниците в самолет, който има 162 места, разделени на 6 колони и 27 реда.
class AirPlane
@@seats = Hash.new(0)
@@sum = 0
@@taken = false

def printSeats()
i = 0
k = 0
	while i<27
		k = 0
		while k < 6
			if k == 2
				print "#{@@seats[[k,i]]} "
			else
				print "#{@@seats[[k,i]]}"
			end
				k = k + 1
		end
		puts
		i = i + 1
	end
end



def add(rvalue)
	@@taken = false
	k = 0
	i = 0
	while i<27
		k = 0
		while k<6
			if @@seats[[k,i]] == 0
				case rvalue
					when 1
					@@seats[[k,i]] = 1
					@@sum =@@sum + rvalue
					@@taken = true
					break
			
					when 2
					if  k<=4
						if @@seats[[k+1,i]] == 0 && k!=2 && k!=5
						@@seats[[k,i]] = 2
						@@seats[[k+1,i]] = 2
						@@sum = @@sum + rvalue
						@@taken = true
						break
						end
					end
			
					when 3
					if  k<=3
						if @@seats[[k+1,i]] == 0 && @@seats[[k+2,i]] == 0 && (k==0 || k==3)
						@@seats[[k,i]] = 3
						@@seats[[k+1,i]] = 3
						@@seats[[k+2,i]] = 3
						@@sum = @@sum + rvalue
						@@taken = true
						break
						end
					end
			
					else break
				end
				k = k + 1
			else
				k = k + 1
			end
		end
		if @@taken == true
			i = 27
		else
			i = i + 1
		end
	end
	if @@taken == false
		puts "Please wait for another plane.We don't have free seats for you."
	end
end

def freeSeats()
	if @@sum < 162
		freeseats = 162 - @@sum
		return freeseats
	else
		puts "There are no free seats left."
		return 0
	end
	end
end

plane = AirPlane.new
passangers = 0
while plane.freeSeats() != 0
	passangers = rand(3) + 1
	plane.add(passangers)
end
plane.printSeats() 
puts "This plane is full and will take off now."
