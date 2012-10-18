require "csv"
x=Hash.new
i=Hash.new
y=Has.new
lists=Dir.glob('*.csv').to_s
x=0
i=0
y=0
for n in lists

CSV.foreach(n) do |row|
	i[row.to_i]=row[0].to_i
	x[row.to_i]=row[1].to_i
	y[row.to_i]=rand(x/2) + 1
	end
end
h=0
for h 1..i

CSV.open("1.csv", "wb") do |csv|
  csv << [i[h],x[h],y[h]]
end
h=h+1
end
CSV.foreach("1.csv" ) do |row|
print ("i=" +i.to_s+"x="+ x.to_s + "y="+y.to_s)
end
