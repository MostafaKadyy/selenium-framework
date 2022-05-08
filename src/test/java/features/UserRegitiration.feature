Feature: user registration
	I want to check that the user can register in our commerce website.
	
	Scenario Outline: user registraion
	Given the user in the home page
	When  he click on register link 
	And   he entered  	"<firsName>" , "<lastName>", "<email>", "<companyName>" , "<password>" 
	Then  the registration page displayed sucsessfully
	
	Examples:
| firsName   | lastName | email          | companyName | password |
| hafdvssan  | morkgos  | hosdr@nana.com | xoxo        | 123456ss |
| hassavfdn  | morkaos  | hmbsr@nana.com | xoxo        | 123456ss |
| hassdfvsan | morskos  | hmor@nana.com  | xoxo 		  	| 123456ss |
