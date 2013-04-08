#Училище: Технологично училище "Електронни системи" към Технически Университет - София
#Клас: 11 Б
#Номер: 12
#Име: Даниела Яворова Алексова
#Задача: https://docs.google.com/document/d/1DF14IHfXhcXVVYX8QRmOV-Ay5ZuJzP6mYvb05GvPa34/edit

class Song
        attr_accessor :name, :artist, :genre, :subgenre, :tags

        def initialize(array,dictionary={})
                array.each do |element| 
			element.strip!
		end
                @name=array[0]
                @artist=array[1]
		create_tags(array[3],dictionary)
                create_genre(array[2].split(","))
        end
        
        def create_tags(array,dictionary)
                @tags=[]
                if array != nil 
                        @tags=array.split(",")
                        @tags.each do|element| 
				element.strip!
			end
                end
		if dictionary.has_key?(@artist) 
                        dictionary[@artist].each do |element| 
				@tags.insert(-1,element.to_s)
			end
                end
        end
        
        def create_genre(array)
                @subgenre=""
                @genre=array[0]
                @tags.push(@genre.downcase)
                if array.size>1 then
                        @subgenre=array[1]
                        @tags.push(@subgenre.downcase)
                end
        end
      
        def display   
		subg=""            
                if @subgenre!="" 
	       		subg=","+@subgenre 	 
		end 
                tags=@tags.join(",")
                p @name + " " + @artist+" "+@genre+subg+" "+tags  
        end
end

class Collection
        def initialize(songs_as_string,dictionary={})
                @songs=[]
                numSongs=0
                strings=songs_as_string.split("\n")
                strings.map {|elem| 
			song=elem.split(".")
                        @songs[numSongs]=Song.new(song,dictionary)
                        numSongs=numSongs+1}  
        end
        
        def selectByTags(songs,criteria)
		if criteria.is_a?  String
			criteria=[criteria] 
		end
                criteria.each do|cr| 
			if cr[-1]=="!"
		                songs.reject! {|song| song.tags.include?(cr[0..cr.size-2])}
			else 
		                songs.select! {|song| song.tags.include?(cr)} 
			end 
		end
        end
	
	def printing(songs)
		if songs.empty?
			p songs
		else		
                	songs.each do |song| 
				song.display
			end
		end
	end
        
        def find(criterias={})
                songs=Array(@songs)
                criterias.each do|criteria| 
			case criteria[0]
				when :tags
					selectByTags(songs,criteria[1]) 
			        when :filter 
					songs.select!{|song| criteria[1].call(song)}
			        when :name
					songs.select!{|song| song.name.==criteria[1]}
				when :artist 
			                songs.select!{|song| song.artist.eql?criteria[1]} 
			end 
		end	
		printing(songs)
        end
end
songs_as_string="My Favourite Things.   John Coltrane.   Jazz,Bebop.   popular, cover
Greensleves.                  John Coltrane.   Jazz,Bebop.  popular, cover
Alabama.                      John Coltrane.   Jazz,Avantgarde.  melancholic
Acknowledgement.              John Coltrane.   Jazz,Avantgarde.
Afro Blue.                    John Coltrane.   Jazz.        melancholic
'Round Midnight.              John Coltrane.   Jazz.
My Funny Valentine.           Miles Davis.     Jazz.         popular
Tutu.                         Miles Davis.     Jazz,Fusion.   weird, cool
Miles Runs the Voodoo Down.   Miles Davis.     Jazz,Fusion.   weird
Boplicity.                    Miles Davis.     Jazz,Bebop.
Autumn Leaves.                Bill Evans.      Jazz.       popular
Waltz for Debbie.             Bill Evans.      Jazz.
'Round Midnight.              Thelonious Monk. Jazz,Bebop.
Ruby, My Dear.                Thelonious Monk. Jazz.           saxophone
Fur Elise.                    Beethoven.       Classical.      popular
Moonlight Sonata.             Beethoven.       Classical.      popular
Pathetique.                   Beethoven.       Classical.
Toccata e Fuga.               Bach.            Classical,Baroque. popular
Goldberg Variations.          Bach.            Classical,Baroque.
Eine Kleine Nachtmusik.       Mozart.          Classical.    popular, violin
"
collection=Collection.new(songs_as_string,{
					'John Coltrane' => %w[saxophone],
					'Bach' => %w[piano polyphony]})
#collection.find 
collection.find artist: 'Bach'
#collection.find tags: %w[classical popular!]
#collection.find tags: 'popular', artist: 'John Coltrane'
#collection.find filter: ->(song) { song.name.start_with?('My') }




























