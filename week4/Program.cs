using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DateTimeCalculator {

    class Program {
        static void Main(string[] args) {

            while (true) {

                Menu1();

                string option1 = Console.ReadLine().Trim();

               
                if (option1.Equals("Q", StringComparison.InvariantCultureIgnoreCase))
                    break;

              
                if (option1.Equals("2")) {

                    Console.WriteLine("Enter expression");
                    

                    string expression = Console.ReadLine().Trim();

                    Console.WriteLine(new NLP().Translate(expression));
                    continue;
                }

                Console.WriteLine("Enter Date");
                string date = Console.ReadLine().Trim();

                
                Calculator calculator = new Calculator(date);

                Menu2();

                string option2 = Console.ReadLine().Trim();

                switch (option2) {

                    case "1":
                        Console.WriteLine(calculator.DetermineDayOfWeek());
                        break;

                    case "2":
                        Console.WriteLine(calculator.DetermineWeekNumber());
                        break;

                    case "3":
                        Console.WriteLine("Enter data to Add");
                      

                        string input1 = Console.ReadLine().Trim();

                        Console.WriteLine(calculator.Add(input1));
                        break;

                    case "4":
                        Console.WriteLine("Enter data to Subtract");
                       
                        string input2 = Console.ReadLine().Trim();

                        Console.WriteLine(calculator.Subtract(input2));
                        break;

                    default:
                        Console.WriteLine("Invalid Choice !!!");
                        break;

                }   


            }

          

        }

        private static void Menu2() {

            Console.WriteLine("Choose Option");
            Console.WriteLine("1. Week Day");
            Console.WriteLine("2. Week Number");
            Console.WriteLine("3. Add");
            Console.WriteLine("4. Subtract");
            
        }

         private static void Menu1() {

            Console.WriteLine("Choose Option");
            Console.WriteLine("1. Enter Date");
            Console.WriteLine("2. Enter Natural Language");
            Console.WriteLine("**Press Q to Quit**");
        }
    }
}
