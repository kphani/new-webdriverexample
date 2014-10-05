@first
Feature: Password management

  Scenario: Forgot password
    When navigate to registration page
    And create new account with details as follows:
      | firstName | LastName | userName | pwd     | conPwd  | dob        | gender | phone    | email   | captcha | T&C |
      | phani     | bhushan  | boy      | test123 | test123 | 22-02-1981 | male   | 07644444 | c@c.com | no      | yes |

