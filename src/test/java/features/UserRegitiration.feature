Feature: user registration
	I want to check that the user can register in our commerce website.
	
	Scenario Outline: user registraion
	Given the user in the home page
	When  he click on register link 
	And   he entered  	"<firsName>" , "<lastName>", "<email>", "<companyName>" , "<password>" 
	Then  the registration page displayed sucsessfully
	
	Examples:
| firsName   | lastName  | email          | companyName | password |
| mostafa  | mortkgos  | hamada@kaday.com| kxoxo        | 123456ss |
| hasavfdn  | modrkaos  | sm2bass6@nashna.com | xoxko        | 123456ss |
| hasdfsan | morjskos  | amog6a4r@nadnaa.com  | xkoxo 		  	| 123456ss |
