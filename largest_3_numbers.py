x=raw_input()

y=raw_input()

z=raw_input()

if(int(x)>int(y) and int(x)>int(z)):

    print str(x)+" is largest"

elif(int(y)>int(z) and int(y)>int(x)):

    print str(y)+ "is largest"

else:

    print str(z)+ "is largest"
