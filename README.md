# Execute-Selenium-scripts-in-existing-browser-that-was-opened-manually

First make sure the path of chrome’s executable is added to the environment variable PATH. 
If not then Go to enviroment variables and add path of chrome on system variable path
        
        ex: C:\Program Files (x86)\Google\Chrome\Application
      
Then create a folder(ex:RunCodeFromManualToAutomation) in any drive 
         
Then open command promt
Type: 
      
      chrome.exe --remote-debugging-port=2020 --user-data-dir="C:\selenum\RunCodeFromManualToAutomation"
     
Once the chrome is launched then manually go to google.com

Then write the script on your IDE (find script in the repository: "src/ConnectSeleniumToExistingBrowserThatWasOpenedManually.java" )

Then run your script and see the magic

         
