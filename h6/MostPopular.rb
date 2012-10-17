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

	clas = Array.new(30) { Array.new(0) {0} }
	res = Array.new(30) {0}

                i = 0; j = 0
                while (i < 30 and j < 30)
                        clas[i][j] = 0
                        i += 1
                        if(i == 30)
                                j += 1; i = 0
                        end
                end
	       
	for i in 1..28
		if i == 21
			next
		end
		prev = 0
		CSV.foreach(i.to_s + ".csv") do |row|
			clas[prev][row[0].to_i - 1] += 1
			prev = row[0].to_i - 1
		end
	end

	for i in 0..29
		j = 0
		res[i] = clas[i][j]
		for j in 0..29
			if clas[i][j] > res[i]
			res[i] = j + 1
			end
		end
	end

	for i in 0..28
		if i == 11
			next
		end
		print ("Num " + (i + 1).to_s + " has given mostly to num " + res[i].to_s + ". \n")
	end	


