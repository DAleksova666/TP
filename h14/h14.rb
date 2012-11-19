#Училище: Технологично училище "Електронни системи" към Технически Университет - София
#Клас: 11 Б
#Номер: 12
#Име: Даниела Яворова Алексова
#Задача: Програма , която товаря сайт и извежда всички линкове в него.

require 'nokogiri'
require 'open-uri'


ARGV.each do |p|
	page=Nokogiri::HTML(open(p))
	links = page.search('a')
	num=0
	for link in links 
	if link['href'].include? "http"
		puts link['href']
	else
		puts "#{p+link['href']}"
	end
		num+=1
	end
	puts "The number of links is : " , num

end

