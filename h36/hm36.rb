#Училище: Технологично училище "Електронни системи" към Технически Университет - София
#Клас: 11 Б
#Номер: 12
#Име: Даниела Яворова Алексова
#Задача: https://docs.google.com/document/d/1waNU1ecWvyiarK0FFe5pnq88GBBuKO_PLX_TStnL_BM/edit?pli=1

class Array

def to_hash(array)
	numbers = Hash.new
	array.each do |couple|
        	numbers = numbers.merge!({couple[0]=>couple[1]})
        end
	p numbers
end

def index_by(array)
      numbers = Hash.new
      array.each do |item|
		numbers = numbers.merge!({(yield item) => item})
      end
      p numbers
end
   
def subarray_count(array,arr)
    	 count = 0
   	 array.each_cons(2) do |elem, next_elem|
    		if elem==arr[0]
			if next_elem==arr[1]
				count=count+1
			end
		end
    	 end
  	 p count
end

def occurences_count(array)
	numbers = Hash.new(0)
	array.each do |item|
	   numbers[item] += 1
	end
	p numbers
	numbers
end

def densities(array)
	hash = Hash.new(0)
	numbers = []
	i=0
	array.each do |item|
	   hash[item] += 1
	end
	array.each do |item|
		if hash.key?(array[item])
			numbers[i]=hash[item]
			i=i+1
		end
	end
	p numbers
end

end

arr=Array.new

arr.to_hash([[1,2],[3,4],[1,6]])

arr.index_by(['Hayden Panettiere','Emilia Clarke']){|name| name.split(' ').last}
arr.index_by(['Gabbie','Danielle']){|s| s.length}

arr.subarray_count([1,1,2,2,1,1,1],[1,1])

arr.occurences_count(['a','c','a','b'])

arr.densities([1,2,1])









