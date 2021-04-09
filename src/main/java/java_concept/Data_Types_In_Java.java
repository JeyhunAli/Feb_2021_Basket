package java_concept;

/**
 * Hello world!
 * jvm is responsibility to execute the code 
 */
public class Data_Types_In_Java {
	
	
    public static void main( String[] args ) {
    System.out.println( "Hello World!" );
    
    
    
    
    System.out.println("\n----------------------------");
    
    
	//  data types mean type of the data which is supporting by java 

	// primitive data type  boolean true or false 
	// numeric data type -- integer family int long byte short
	// floating: float, double 
	// non primmitive data type: String 

	/**
	 * byte	-------  1 byte	Stores whole numbers from -128 to 127
       short -------	2 bytes	Stores whole numbers from -32,768 to 32,767
       int	-------- 4 bytes	Stores whole numbers from -2,147,483,648 to 2,147,483,647
       long	--------- 8 bytes	Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
       float --------	4 bytes	Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
       double --------	8 bytes	Stores fractional numbers. Sufficient for storing 15 decimal digits
       boolean -------	1 bit	Stores true or false values
       char	 -----------2 bytes	Stores a single character/letter or ASCII values
	 * 
	 * It is a numeric value given to different characters and symbols, 
	 * for computers to store and manipulate. For example,
	 *  the ASCII value of the letter 'A' is 65.
	 * 
	 * ASCII -- satnds for 
	 * American Standard Code for Information Interchange
	 * ascii range for small a-z  97-122
	 * capital A-Z   65-90
	 * 
	 */




	byte b = 10;
	b = 20;
	byte b1 = 20;

	System.out.println(b1);
	System.out.println(b+b1);

	//2. short:
	//size: 2 bytes: 16 bits
	//range : -32768 to 32767
	short s1 = 120;
	short s2 = 200;
	System.out.println(s2/2);

	//3. int:
	//size: 4 bytes = 32 bits
	//range: -2147483648 to 2147483647
	int i = 1000;
	int j = -100;
	int k = 0;
	System.out.println(i+j+k);

	//4. long:
	//size: 8 bytes : 64 bits
	//range : 
	long l = 12333339999999l;
	long l1 = -122222;

	long l2 = 10;

	//5. float :
	//size: 4 bytes : 32 bits
	//range : upto 7 decimal digits
	float f1 = (float)12.33;
	float f2 = 14.33f;
	float f3 = 100; //100.0

	System.out.println(f1);
	System.out.println(f2);
	System.out.println(f3);

	//6. double:
	//size: 8 bytes : 64 bits
	//range : upto 16 decimal digits
	double d1 = 12.33333;
	System.out.println(d1+100);

	//7. character:
	char c1 = 'a';
	char c11 = 'b';
	char c2 = '1';
	char c3 = '$';
	char c4 = 'b';

	System.out.println(c1);
	System.out.println(c1+c11);//97 + 98 = 195

	//a-z: 97-122
	//A-Z: 65-90
	//0-9: 48-57

	//8. boolean: true/false
	//size: ~ 1 bit
	boolean flag = true;
	boolean flag1 = false;
	System.out.println(flag);
	System.out.println(flag1);


	//9. String: is Class in java thats why its written in capital letter
	//its not a data type
	//String is double quoted value in most of the programming lanuage
	//String is collection of multiple charakters
	String str = "Hello World";
	System.out.println(str);
	
	System.out.println("\n America" + " " + "is" + " " + "great again");

	String str1 = "this is my java code and im super excited";
	System.out.println("\n"+str1);

	String str2 = "100";
	System.out.println(str2+20);//10020

	System.out.println("this is selenium");
	System.out.println(123+23);

	System.out.println(str + " " + str2 );
	
	
//there are decimal numbers and octal numbers 
// the base of the decimal numbers is 10  
// the base of the octal numbers is 8     
	byte bc = 077;
	System.out.println("octal number is --->>> " +bc);


	byte bc1 = (byte)128;
	System.out.println(bc1);  //-128
	
	byte bc2 = (byte)1288;
	System.out.println(bc2);  // 0
	



	/**        ASCII Table
Dec  = Decimal Value
Char = Character

'5' has the int value 53
if we write '5'-'0' it evaluates to 53-48, or the int 5
if we write char c = 'B'+32; then c stores 'b'


Dec  Char                           Dec  Char     Dec  Char     Dec  Char
---------                           ---------     ---------     ----------
0  NUL (null)                      32  SPACE     64  @         96  `
1  SOH (start of heading)          33  !         65  A         97  a
2  STX (start of text)             34  "         66  B         98  b
3  ETX (end of text)               35  #         67  C         99  c
4  EOT (end of transmission)       36  $         68  D        100  d
5  ENQ (enquiry)                   37  %         69  E        101  e
6  ACK (acknowledge)               38  &         70  F        102  f
7  BEL (bell)                      39  '         71  G        103  g
8  BS  (backspace)                 40  (         72  H        104  h
9  TAB (horizontal tab)            41  )         73  I        105  i
10  LF  (NL line feed, new line)    42  *         74  J        106  j
11  VT  (vertical tab)              43  +         75  K        107  k
12  FF  (NP form feed, new page)    44  ,         76  L        108  l
13  CR  (carriage return)           45  -         77  M        109  m
14  SO  (shift out)                 46  .         78  N        110  n
15  SI  (shift in)                  47  /         79  O        111  o
16  DLE (data link escape)          48  0         80  P        112  p
17  DC1 (device control 1)          49  1         81  Q        113  q
18  DC2 (device control 2)          50  2         82  R        114  r
19  DC3 (device control 3)          51  3         83  S        115  s
20  DC4 (device control 4)          52  4         84  T        116  t
21  NAK (negative acknowledge)      53  5         85  U        117  u
22  SYN (synchronous idle)          54  6         86  V        118  v
23  ETB (end of trans. block)       55  7         87  W        119  w
24  CAN (cancel)                    56  8         88  X        120  x
25  EM  (end of medium)             57  9         89  Y        121  y
26  SUB (substitute)                58  :         90  Z        122  z
27  ESC (escape)                    59  ;         91  [        123  {
28  FS  (file separator)            60  <         92  \        124  |
29  GS  (group separator)           61  =         93  ]        125  }
30  RS  (record separator)          62  >         94  ^        126  ~
31  US  (unit separator)            63  ?         95  _        127  DEL

	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * How to convert from octal to decimal
A regular decimal number is the sum of the digits multiplied with 10n.

Example #1
137 in base 10 is equal to each digit multiplied with its corresponding 10n:

13710 = 1×102+3×101+7×100 = 100+30+7

Octal numbers are read the same way, but each digit counts 8n instead of 10n.

Multiply each digit of the hex number with its corresponding 8n.

Example #2
37 in base 8 is equal to each digit multiplied with its corresponding 8n:

378 = 3×81+7×80 = 24+7 = 31

Example #3
7014 in base 8 is equal to each digit multiplied with its corresponding power of 8:

70148 = 7×83+0×82+1×81+4×80= 3584+0+8+4 = 3596
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */














}


      
    }

