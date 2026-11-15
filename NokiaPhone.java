import java.util.Scanner;
public class NokiaPhone {
  public static void main(String[] args){
    Scanner inputcollector = new Scanner(System.in);
    String mainMenu = """

 Nokia 5510
Welcome to Nokia 5510 the best phone ever!!!

list of menu function
 1 for Phone Book
 2 for Messages
 3 for Chat
 4 for Call Register
 5 for Tones
 6 for Settings
 7 for Call Divert
 8 for Music
 9 for Games
 10 for Calculator
 11 for Reminder
 12 for Clock
 13 for Profiles
 14 for Services
 15 for SIM Services


Enter your preferred option:
""";

System.out.println(mainMenu);
int mainMenuList = inputcollector.nextInt();


    switch (mainMenuList) {
     case 1:
        String phonebookMenu = """
      Phone Book Menu 
      Press 1 for Search
      Press 2 for Service Nos.
      Press 3 for Add Name
      Press 4 for Erase
      Press 5 for Edit
      Press 6 for Copy
      Press 7 for Assign tone
      Press 8 for Send b'card
      Press 9 for Options
      Press 10 for Speed dials
      Press 11 for Voice tags
      
      Enter your preferred option:
      """;
    
      System.out.println(phonebookMenu);
      int phonebookOption = inputcollector.nextInt();
      
        switch (phonebookOption) {
      
          case 1:
           System.out.println("Searching");
            break;
        
          case 2: 
           System.out.println("Service Nos.");
            break;
          
          case 3: 
          System.out.println("Add Name");
          break;
          
         case 4: 
          System.out.println("Erase");
          break;
          
         case 5: 
          System.out.println("Edit");
          break;
          
         case 6: 
          System.out.println("Copy");
          break;
          
         case 7: 
          System.out.println("Assign tone");
          break;
          
         case 8: 
          System.out.println("Send b'card");
          break;
          
         case 9: 
                      String optionsMenu = """
                   Options Menu 
                  Press 1 for Memory in use
                  Press 2 for Type of view
                  Press 3 for Memory status
                  
                
                  Enter your preferred option:
                  """;
                  
                  System.out.println(optionsMenu);
                  int optionsOption = inputcollector.nextInt();
                  
                  switch (optionsOption) {
      
                        case 1:
                          System.out.println("Memory in use");
                          break;
                        
                        case 2: 
                          System.out.println("Type of view");
                          break;
                          
                         case 3: 
                          System.out.println("Memory status");
                          break;
                          
                        default:
                          System.out.println("Invalid option inputted!");
                      
                      }
                     break;
                          
         case 10: 
          System.out.println("Speed dials");
          break;
          
        case 11: 
          System.out.println("Voice tags");
          break;
          
        default:
          System.out.println("Invalid option inputted!");
          
      }
      
      break;
      
      
      
      
  
      case 2:
          String messageMenu = """
       Message Menu 
      Press 1 for Write Messages
      Press 2 for Indox
      Press 3 for Outbox
      Press 4 for Picture Messages
      Press 5 for Templates
      Press 6 for Smileys
      Press 7 for Message Settings
      Press 8 for Info Service
      Press 9 for Voice Mailbox Number
      Press 10 for Service Command Editor
      
      Enter your preferred option:
      """;
    
      System.out.println(messageMenu);
      int messageOption = inputcollector.nextInt();
      
      switch (messageOption) {
      
        case 1:
          System.out.println("Write Messages");
          break;
        
        case 2: 
          System.out.println("Inbox Empty");
          break;
          
         case 3: 
          System.out.println("Outbox Empty");
          break;
          
         case 4: 
          System.out.println("Picture Message Empty");
          break;
          
         case 5: 
          System.out.println("Templates Empty");
          break;
          
         case 6: 
          System.out.println("Smileys");
          break;
          
          case 7: 
                          String messagesettingsMenu = """
                    Message Settings Menu 
                    Press 1 for Set 1
                    Press 2 for Common
                    
                    
                    Enter your preferred option:
                    """;
                    
                    System.out.println(messagesettingsMenu);
                    int messagesettingOption = inputcollector.nextInt();
                    
                    switch (messagesettingOption) {
                    
                      case 1: 
                        String set1Menu = """
                    ========== Set 1 Menu ==========
                    Press 1 for Message Centre number
                    Press 2 for Message sent as
                    Press 3 for Message validity
                    
                    
                    Enter your preferred option:
                    """;
                    
                    System.out.println(set1Menu);
                    int set1Option = inputcollector.nextInt();
                    
                    switch (set1Option) {
                    
                      case 1:
                        System.out.println("Centre number");
                        break;
                      
                      case 2: 
                        System.out.println("Message sent as");
                        break;
                        
                       case 3: 
                        System.out.println("Message validity");
                        break;
                      
                      default:
                        System.out.println("Invalid option inputted!");
                        
                    }
                    
                    break;
                      
                      
                      case 2: 
                        String commonMenu = """
                     Common Menu 
                    Press 1 for Delivery reports
                    Press 2 for Reply via same centre
                    Press 3 for Character support
                    
                    
                    Enter your preferred option:
                    """;
                    
                    System.out.println(commonMenu);
                    int commonOption = inputcollector.nextInt();
                    
                    switch (commonOption) {
                    
                      case 1:
                        System.out.println("Delivery reports");
                        break;
                      
                      case 2: 
                        System.out.println("Reply via same centre");
                        break;
                        
                       case 3: 
                        System.out.println("Character support");
                        break;
                      
              default:
                  System.out.println("Invalid");
                        
                   }
                    
              break;
          }
          
          case 8: 
              System.out.println("Info Service");
              break;
              
          case 9: 
              System.out.println("Voice Mailbox Number");
              break;
              
          case 10: 
              System.out.println("Service Command Editor");
              break;
          
      default:
          System.out.println("Invalid option inputted!");
          
      }
      
      break;
      
      case 3: 
          System.out.println("Welcome to Chat");
          break;
          
       case 4: 
                String callregisterMenu = """
             Call register Menu 
             1 for Missed calls
             2 for Received calls
             3 for Dialled numbers
             4 for Erase recent call lists
             5 for Show call duration
             6 for Show call costs
             7 for Call cost settings
             8 for Prepaid credit
            
           
            Enter your preferred option:
            """;
            
            System.out.println(callregisterMenu);
            int callregisterOption = inputcollector.nextInt();
            
            switch (callregisterOption) {
            
              case 1:
                System.out.println("Missed calls");
                break;
              
              case 2: 
                System.out.println("Received calls");
                break;
                
               case 3: 
                System.out.println("Dialled numbers");
                break;
                
               case 4: 
                System.out.println("Erase recent call lists");
                break;
                
              case 5: 
                                       String showcalldurationMenu = """
                           Show Call Duration Menu 
                           1 for Last call duration
                           2 for All calls' duration
                           3 for Received calls' duration
                           4 for Dialled calls' duration
                           5 for Clear timers
                          
                          
                          Enter your preferred option:
                          """;
                          
                          System.out.println(showcalldurationMenu);
                          int showcalldurationOption = inputcollector.nextInt();
                          
                          switch (showcalldurationOption) {
                          
                            case 1:
                              System.out.println("Last call duration");
                              break;
                            
                            case 2: 
                              System.out.println("All calls' duration");
                              break;
                              
                             case 3: 
                              System.out.println("Received calls' duration");
                              break;
                              
                             case 4: 
                              System.out.println("Dialled calls' duration");
                              break;
                              
                            case 5: 
                              System.out.println("Clear timers");
                              break;
                              
                          default:
                                System.out.println("Invalid option inputted!");
                            
                                }
                               break;
                               
                               
              case 6: 
                                       String showcallcostsMenu = """
                           Show Call Costs Menu 
                           1 for Last call cost
                           2 for All calls' cost
                           3 for Clear counters
                          
                         
                          Enter your preferred option:
                          """;
                          
                          System.out.println(showcallcostsMenu);
                          int showcallcostsOption = inputcollector.nextInt();
                          
                          switch (showcallcostsOption) {
                          
                            case 1:
                              System.out.println("Last call cost");
                              break;
                            
                            case 2: 
                              System.out.println("All calls' cost");
                              break;
                              
                             case 3: 
                              System.out.println("Clear counters");
                              break;
                              
                          default:
                                System.out.println("Invalid option inputted!");
                            
                                }
                               break;
                               
                               
                case 7: 
                                       String callcostssettingsMenu = """
                           Call Costs Settings Menu 
                           1 for Call cost limit
                           2 for Show costs in
                          
                         
                          Enter your preferred option:
                          """;
                          
                          System.out.println(callcostssettingsMenu);
                          int callcostssettingsOption = inputcollector.nextInt();
                          
                          switch (callcostssettingsOption) {
                          
                            case 1:
                              System.out.println("Call cost limit empty");
                              break;
                            
                            case 2: 
                              System.out.println("Show costs in empty");
                              break;
                              
                          default:
                                System.out.println("Invalid option inputted!");
                            
                                }
                               break;
              
                case 8: 
                System.out.println("Prepaid credit");
                break;
                
              default:
                System.out.println("Invalid option inputted!");
            
                }
               break;
               
               
               
               
        case 5:
                    String tonesMenu = """
               Tones Menu 
                 1 for Ringing tone
                 2 for Ringing volume
                 3 for Incoming call alert
                 4 for Message alert tone
                 5 for Keypad tones
                 6 for Warning tones
                 7 for Vibrating alert
                 8 for Screen saver
                 
                
                Enter your preferred option:
                """;
              
                System.out.println(tonesMenu);
                int tonesOption = inputcollector.nextInt();
                
                switch (tonesOption) {
                
                  case 1:
                    System.out.println("Ringing tone");
                    break;
                  
                  case 2: 
                    System.out.println("Ringing volume");
                    break;
                    
                   case 3: 
                    System.out.println("Incoming call alert");
                    break;
                    
                   case 4: 
                    System.out.println("Message alert tone");
                    break;
                    
                   case 5: 
                    System.out.println("Keypad tones");
                    break;
                    
                   case 6: 
                    System.out.println("Warning tones");
                    break;
                    
                  case 7: 
                    System.out.println("Vibrating alert");
                    break;
                    
                  case 8: 
                    System.out.println("Screen saver");
                    break;
                    
                default:
                System.out.println("Invalid option inputted!");
            
                }
               break;
                    
                    
       case 6:
          String settingsMenu = """
       Settings Menu 
      Press 1 for Call Settings
      Press 2 for Phone Settings
      Press 3 for Security Settings
      Press 4 for Restore Factory Settings
      
      
      Enter your preferred option:
      """;
      
      System.out.println(settingsMenu);
      int settingsOption = inputcollector.nextInt();
      
      switch (settingsOption) {
      
                case 1:
                            String callsettingsMenu = """
                           Show Call Settings Menu 
                           1 for Automatic redial
                           2 for Speed dialling
                           3 for Call waiting options
                           4 for Own number sending
                           5 for Phone line in use
                           6 for Automatic answer
                          
                         
                          Enter your preferred option:
                          """;
                          
                          System.out.println(callsettingsMenu);
                          int callsettingsOption = inputcollector.nextInt();
                          
                          switch (callsettingsOption) {
                          
                            case 1:
                              System.out.println("Automatic redial");
                              break;
                            
                            case 2: 
                              System.out.println("Speed dialling");
                              break;
                              
                             case 3: 
                              System.out.println("Call waiting options");
                              break;
                              
                             case 4: 
                              System.out.println("Own number sending");
                              break;
                              
                            case 5: 
                              System.out.println("Phone line in use");
                              break;
                              
                            case 6: 
                              System.out.println("Automatic answer");
                              break;
                              
                          default:
                                System.out.println("Invalid option inputted!");
                            
                                }
                               break;
                               
      
              case 2: 
                            String phonesettingsMenu = """
                           Phone Settings Menu 
                           1 for Language
                           2 for Cell info display
                           3 for Welcome note
                           4 for Network selection
                           5 for Confirm SIM service actions
                          
                          
                          Enter your preferred option:
                          """;
                          
                          System.out.println(phonesettingsMenu);
                          int phonesettingsOption = inputcollector.nextInt();
                          
                          switch (phonesettingsOption) {
                          
                            case 1:
                              System.out.println("Language");
                              break;
                            
                            case 2: 
                              System.out.println("Cell info display");
                              break;
                              
                             case 3: 
                              System.out.println("Welcome note");
                              break;
                              
                             case 4: 
                              System.out.println("Network selection");
                              break;
                              
                            case 5: 
                              System.out.println("Confirm SIM service actions");
                              break;
                           
                          default:
                                System.out.println("Invalid option inputted!");
                            
                                }
                               break;
         
          case 3: 
                       String securitysettingsMenu = """
                           Security Settings Menu 
                           1 for PIN code request
                           2 for Call barring service
                           3 for Fixed dialling
                           4 for Closed user group
                           5 for Security level
                           6 for Change access codes
                          
                          
                          Enter your preferred option:
                          """;
                          
                          System.out.println(securitysettingsMenu);
                          int securitysettingsOption = inputcollector.nextInt();
                          
                          switch (securitysettingsOption) {
                          
                            case 1:
                              System.out.println("PIN code request");
                              break;
                            
                            case 2: 
                              System.out.println("Call barring service");
                              break;
                              
                             case 3: 
                              System.out.println("Fixed dialling");
                              break;
                              
                             case 4: 
                              System.out.println("Closed user group");
                              break;
                              
                            case 5: 
                              System.out.println("Security level");
                              break;
                           
                           case 6: 
                              System.out.println("Change access codes");
                              break;
                           
                          default:
                                System.out.println("Invalid option inputted!");
                            
                                }
                               break;
       
         case 4: 
          System.out.println("Restore Factory Settings");
          break;
          
        default:
          System.out.println("Invalid option inputted!");
      
      }
     break;
     
    case 7: 
          System.out.println("Call Divert");
          break;
          
    case 8:
          String musicMenu = """
      Music Menu 
      Press 1 for Music Player
      Press 2 for Radio
      Press 3 for Recorder
      Press 4 for Track List
      
      
      Enter your preferred option:
      """;
      
      System.out.println(musicMenu);
      int musicOption = inputcollector.nextInt();
      
      switch (musicOption) {
      
        case 1:
          System.out.println("Listening to music");
          break;
        
        case 2: 
          System.out.println("Radio Playing");
          break;
          
         case 3: 
          System.out.println("Recording");
          break;
          
         case 4: 
          System.out.println("Track List Empty");
          break;
          
        default:
          System.out.println("Invalid option inputted!");
      
      }
     break;
     
     case 9:
          System.out.println("Games");
          break;
          
      case 10: 
          System.out.println("Calculator");
          break;
          
      case 11: 
          System.out.println("Reminders");
          break;
          
      case 12: 
                                String clockMenu = """
                          Clock Menu 
                           1 for Alarm
                           2 for Clock settings
                           3 for Date setting
                           4 for Stopwatch
                           5 for Countdown timer
                           6 for Auto update of date and time
                          
                          
                          Enter your preferred option:
                          """;
                          
                          System.out.println(clockMenu);
                          int clockOption = inputcollector.nextInt();
                          
                          switch (clockOption) {
                          
                            case 1:
                              System.out.println("Alarm");
                              break;
                            
                            case 2: 
                              System.out.println("Clock settings");
                              break;
                              
                             case 3: 
                              System.out.println("Date setting");
                              break;
                              
                             case 4: 
                              System.out.println("Stopwatch");
                              break;
                              
                            case 5: 
                              System.out.println("Countdown timer");
                              break;
                           
                           case 6: 
                              System.out.println("Auto update of date and time");
                              break;
                           
                          default:
                                System.out.println("Invalid option inputted!");
                            
                                }
                               break;
          
      case 13: 
          System.out.println("Profiles");
          break;
          
      case 14: 
          System.out.println("Services");
          break;
          
      case 15: 
          System.out.println("SIM Services");
          break;

    default:
          System.out.println("Oga enter better option!!!");
 
 }
}
   }
 



