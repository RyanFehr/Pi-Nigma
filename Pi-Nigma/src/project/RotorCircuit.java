package project;


public class RotorCircuit extends Circuit{
	 char[] paths;
	 short offset = 0;
	 
	 RotorCircuit(short wireConfig)
	 {
		 //sets the internalWiring according to a list of rotor's wire configurations
		 switch (wireConfig)
		 {
		 case -1://Entry Rotor
			 this.paths = new char[]{'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
			 break;
		 case 1:
			 this.paths = new char[]{'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
			 break;
		 case 2:
			 this.paths = new char[]{'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
			 break;
		 case 3:
			 this.paths = new char[]{'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
			 break;
		 case 4:
			 this.paths = new char[]{'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
			 break;
		 case 5:
			 this.paths = new char[]{'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
			 break;
		 case 0://Reflection Rotor
			 this.paths = new char[]{'d','b','c','a','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
			 break;
		 case -2://Test Rotor, used exclusively for JUnit testing
			 this.paths = new char[]{'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
			 break;
		 }
	 }
	 
	 char passCurrent(char source)
	 {
		 source += offset;
		 
		 switch(source)
		 {
		 case 'a':
			 return this.paths[0];
		 case 'b':
			 return this.paths[1];
		 case 'c':
			 return this.paths[2];
		 case 'd':
			 return this.paths[3];
		 case 'e':
			 return this.paths[4];
		 case 'f':
			 return this.paths[5];
		 case 'g':
			 return this.paths[6];
		 case 'h':
			 return this.paths[7];
		 case 'i':
			 return this.paths[8];
		 case 'j':
			 return this.paths[9];
		 case 'k':
			 return this.paths[10];
		 case 'l':
			 return this.paths[11];
		 case 'm':
			 return this.paths[12];
		 case 'n':
			 return this.paths[13];
		 case 'o':
			 return this.paths[14];
		 case 'p':
			 return this.paths[15];
		 case 'q':
			 return this.paths[16];
		 case 'r':
			 return this.paths[17];
		 case 's':
			 return this.paths[18];
		 case 't':
			 return this.paths[19];
		 case 'u':
			 return this.paths[20];
		 case 'v':
			 return this.paths[21];
		 case 'w':
			 return this.paths[22];
		 case 'x':
			 return this.paths[23];
		 case 'y':
			 return this.paths[24];
		 case 'z':
			 return this.paths[25];
		 }
		 return '/';
	 }
	 
	 char passCurrent(int source)
	 {
		 source+= offset;
		 switch(source)
		 {
		 case 0:
			 return this.paths[0];
		 case 1:
			 return this.paths[1];
		 case 2:
			 return this.paths[2];
		 case 3:
			 return this.paths[3];
		 case 4:
			 return this.paths[4];
		 case 5:
			 return this.paths[5];
		 case 6:
			 return this.paths[6];
		 case 7:
			 return this.paths[7];
		 case 8:
			 return this.paths[8];
		 case 9:
			 return this.paths[9];
		 case 10:
			 return this.paths[10];
		 case 11:
			 return this.paths[11];
		 case 12:
			 return this.paths[12];
		 case 13:
			 return this.paths[13];
		 case 14:
			 return this.paths[14];
		 case 15:
			 return this.paths[15];
		 case 16:
			 return this.paths[16];
		 case 17:
			 return this.paths[17];
		 case 18:
			 return this.paths[18];
		 case 19:
			 return this.paths[19];
		 case 20:
			 return this.paths[20];
		 case 21:
			 return this.paths[21];
		 case 22:
			 return this.paths[22];
		 case 23:
			 return this.paths[23];
		 case 24:
			 return this.paths[24];
		 case 25:
			 return this.paths[25];
		 }
		 return '/';
	 }
	 
	 void rewire()
	 {
		 if(offset == 25){offset = 0;}
		 else{offset++;}
	 }
}
 