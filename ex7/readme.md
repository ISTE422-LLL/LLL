Compile: 
javac -cp .:junit-4.12.jar:hamcrest-core-1.3.jar MainTester.java

Run:
java -cp .:junit-4.12.jar:hamcrest-core-1.3.jar MainTester
java -cp .:junit-4.12.jar:hamcrest-core-1.3.jar MainTester -h
java -cp .:junit-4.12.jar:hamcrest-core-1.3.jar MainTester -n "1,test"
java -cp .:junit-4.12.jar:hamcrest-core-1.3.jar MainTester -f testobjectfile.txt
