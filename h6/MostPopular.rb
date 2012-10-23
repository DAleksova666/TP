#Училище: Технологично училище "Електронни системи" към Технически Университет - София
   #Клас: 11 Б
   #Номер: 12
   #Име: Даниела Яворова Алексова
   #Задача: Програма, която намира най-популярния ученик(най-често срещания номер) използвайки няколко csv файла.
require "csv"
vote= Hash.new(0)
Dir.glob('*.csv') do |item|
  	    f = File.open(item,"r")
		content = f.read
		content.each_line do |line|
			vote[line.to_i]=vote[line.to_i]+1
				end
		end


	popular=0
	for i in 1..29
	    if vote[i]>popular
		popular=vote[i]
		person=i
	    end
	end
	puts "The Most popular number is "+ person.to_s




	popular=0
	for i in 1..29
	    if vote[i]<popular
		popular=vote[i]
		per=i
	    end
	    if vote[i]==popular 
		per=i
		puts "The Least popular number is "+ per.to_s
	    end
	end




	puts "Here are the statistics if you want to check "
	for i in 1..29
	    puts "Number "+i.to_s+" got "+vote[i].to_s+" votes"
	end 

	
