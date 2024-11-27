
Feature:Automate TestLeaf Application
#@smoke
#Scenario: TC001_login and Loout
	#Given Launch chrome browser and load url 
	#And enter username as demosalesmanager
	#And enter password as crmsfa
	#When click the login button 
	#Then its navigated Homepage 
	#And  click the logout button
	#And close browser
	
	@smoke
Scenario Outline: TC001_login and Loout
	Given Launch chrome browser and load url 
	And enter username as <username>
	And enter password as <password>
	When click the login button 
	Then its navigated Homepage 
	And  click the logout button
	And close browser
	
	Examples:
	|username|password|
	|DemoSalesManager|crmsfa|
	|DemoCSR|crmsfa|
	
	@wip
	Scenario: TC002_login and Loout for failure
	Given Launch chrome browser and load url 
	And enter username as lovely
	And enter password as crmsfa
	When click the login button 
	Then its navigated same page 
	But verify error message
	And close browser
	
	@smoke
	Scenario Outline: TC003_verify TestLeaf CreateLead
	Given Launch chrome browser and load url 
	And enter username as demosalesmanager
	And enter password as crmsfa
	And click the login button 
	And click CRMSFA
	And click leads link
	When click Create Lead link	
	And its navigated CreateLeadPage
	And enter the company as <companyname>
	And enter the firstname as <firstname>
	And enter the lastname as <lastname>
	And choose source as Website
	And click the Create Lead button
	Then its navigated ViewLeadPage 
	And verify the firstname	
	And close browser
	Examples:
	|companyname|firstname|lastname|
	|ABC|Hema|Mali|
	|CBC|Hema1|Mali1|
	|XYZ|Gopi|Nath|
	
	#@regression
	Scenario: TC004_verify TestLeaf EditLead
	Given Launch chrome browser and load url 
	And enter username as demosalesmanager
	And enter password as crmsfa
	And click the login button 
	And click CRMSFA
	And click leads link
	When click Find Leads
	And enter firstname
	And click Find Leads button
	And click first resulting lead
	Then navigated ViewLeadPage
	And verify title of the page
	And click on Edit
	Then navigated Edit Lead page
	And change the company name
	And click update
	And confirm changed name appears
	And close browser

	
	