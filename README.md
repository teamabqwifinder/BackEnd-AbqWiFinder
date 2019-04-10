# BackEnd-AbqWiFinder

### Your aims or motivations for selecting the given topic for your project. That is, why did you choose to develop this particular project, and why is this (at least potentially) a useful or interesting project?

We selected this particular project because of its potential ability to positively effect the developer scene in the local Albuquerque Area. We have seen in the last few years, exponential growth from the tech sector in Albuquerque and the greater region, this is in part because of local entrepreneurs who are putting in the hard work everyday trying to get their ideas off the ground. The purpose of the ABQ WiFinder project is that it will enhance the voice of these entrepreneurs when dealing with local businesses or spaces. Strong developers need good development spaces, places that have a strong wifi connection are essential to these developers and our Application will support this endevour. 

But most of all this application will function at its core as a wifinder application that anyone can use. 

### A “functional inventory” for that repository—i.e. what functional components of the overall project are implemented by code in that repository?

  Currently the application in it's Alpha stage is mostly cosmetic but does show several locations and an included map. 
- A login screen powered by Google Sign In [Google Sign In](https://github.com/googlesamples/google-services/tree/master/android/signin)
- Several fragments that the user can switch between. 

### TEAM ROSTER

- Felipe Cook (Front-End)
- Faycel Beji (Back-End)
- Josh DeLeon (Project Manager)

### A description of the current state of completion/readiness of this component, or your project as a whole. This should include a “hit list” of deficiencies: any unimplemented/incomplete elements, and known bugs, that would have to be implemented or corrected for a usable prototype (i.e. one that could be given to a skilled user for testing and feedback), ordered with the most urgent items first.

This project is still in its Alpha phase of testing and deployment. While features are able to be viewed and the google maps is currently working, it is still unable to retrieve data from local developer spaces. This will be enabled in the beta version and this will include the main functionality package. Bugs still occur sporadically when switching fragments.

Our order of priorities:
1. The Application runs local businesses information on its server
2. Implementing the google maps to also display this information
3. Creation of the favorite locations code, to enable users to save favorite locations. 

### A list of platforms (Java versions, Android APIs, OS versions, specific hardware, etc.) on which you’ve tested the submitted version of this component of your project, any hardware/software/orientation restrictions that you’re aware of. (This includes restrictions on device language, orientation, etc.)

#### Devices

Motorola G6 API 26 - On this device it seemed to work functionally okay. The app was able to jump from correct fragment to correct fragment.

#### Emulators

Nexus 5X API 24 - On this emulator it seemed to work functionally okay. The app was able to jump from correct fragment to correct fragment.

Samsung SM - G930U- On this emulator it seemed to work functionally okay. The app was able to jump from correct fragment to correct fragment.

### For client side components, a list of aesthetic/cosmetic (not functional) improvements that you think would improve this component. This list should be ordered, with those that would give the most improvement (in your opinion) listed first.

- Ensuring that this application will run on a variety of devices, more field testing. 
- Improving User Navigability and Understanding from the Beginning to End point.
- Allowing Users to become Certified Reviewers.
- Improving the App performance on a variety of hardware. 

### A list of functional stretch goals. These should be sorted either with those that would add the most utility at the top, or with those that would be the simplest to implement at the top.

- Improve User Experience
- Have a fully functioning application

### Links to the most recent wireframes and up-to-date user stories for your project.

[WireFrame](https://github.com/teamabqwifinder/ABQ-WiFinder-Pre-Planning/blob/master/WireFrame.pdf)

[UserStories](https://github.com/teamabqwifinder/ABQ-WiFinder-Pre-Planning/blob/master/UserStory.md)

### Links to the up-to-date ERD and DDL for this component’s data model.

[Back-End ERD](https://github.com/teamabqwifinder/ABQ-WiFinder-Pre-Planning/blob/master/WiFinderBackEndFinalUpdate.pdf)

[Front-End ERD](https://github.com/teamabqwifinder/ABQ-WiFinder-Pre-Planning/blob/master/Capstone_ERD.pdf)

[DDL](https://github.com/teamabqwifinder/BackEnd-AbqWiFinder/blob/master/DDL.sql)

## Documentation
For more details on current classes and methods, see [Javadoc](docs/api/)

### Licenses

Copyright 2019 Faycel Beji, Felipe Cook, Josh DeLeon & Deep Dive Coding

Licensed under the Apache License, Version 2.0 (the “License”); you may not use this file except in compliance with the License. You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an “AS IS” BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License.

[Full (including 3rd party) licenses and copyrights](https://github.com/teamabqwifinder/ABQ-WiFinder-Pre-Planning/blob/master/Copyright.md)

### Instructions for Building ABQWiFinder Server

1. From the celestial-bodies github repository copy the SSH copy key

2. Open up your preferred IDE (Intellij in this example) and from the homepage, select "Check out from version Control." Select git and paste the SSH key into the url field, save it to a a directory of your choosing, and click "Clone."

3. Once the clone is finished, you'll be asked whether or not you want to open the project, and you may do so, no import needed. Once the project is open, it'll take a moment to build, but once finished, you can run the server. 


### Instructions for Running ABQWiFinder Server

Once the program is cloned and ready to go, just allow it to build and launch the server before launching the app.


