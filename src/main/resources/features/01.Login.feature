Feature: HalamanLogin
  Scenario: Input user name password valid
    When Masuk Halaman Login
    And input username
    And Input password
    And klik button login
    Then menampilkan dashboard