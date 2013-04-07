#Училище: Технологично училище "Електронни системи" към Технически Университет - София
#Клас: 11 Б
#Номер: 12
#Име: Даниела Яворова Алексова
#Задача: https://docs.google.com/document/d/1waNU1ecWvyiarK0FFe5pnq88GBBuKO_PLX_TStnL_BM/edit?pli=1

class Array

def to_hash
	numbers = Hash.new
	each do |couple|
        	numbers = numbers.merge!({couple[0]=>couple[1]})
        end
	numbers
end

def index_by
      numbers = Hash.new
      each do |item|
		numbers = numbers.merge!({(yield item) => item})
      end
      numbers
end
   
def subarray_count(arr)
    	 count = 0
   	 each_cons(2) do |elem, next_elem|
    		if elem==arr[0]
			if next_elem==arr[1]
				count=count+1
			end
		end
    	 end
  	 count
end

def occurences_count
	numbers = Hash.new(0)
	each do |item|
	   numbers[item] += 1
	end
	numbers
end

def densities
	hash = Hash.new(0)
	numbers = []
	i=0
	each do |item|
	   hash[item] += 1
	end
	each do |item|
		if hash.key?(item)
			numbers[i]=hash[item]
			i=i+1
		end
	end
	numbers
end

end

arr=Array.new

p [[1,2],[3,4],[1,6]].to_hash

p ['Hayden Panettiere','Emilia Clarke'].index_by {|name| name.split(' ').last}
p (['Gabbie','Danielle']).index_by {|s| s.length}

p [1,1,2,2,1,1,1].subarray_count([1,1])

p ['a','c','a','b'].occurences_count

p [1,2,1].densities









