import java.io.Console;
class numbers{
		 public static void main(String[] args) {
		 	int i = 0;
		 	while(i < 10){
				Console console = System.console();
				int input = Integer.parseInt(console.readLine("Type the ammount of repetition you want :" ));
				for (i < input + 1; i++){
		 		System.out.println("Number " + i);
		 		}
		 	}	
		}
	}

