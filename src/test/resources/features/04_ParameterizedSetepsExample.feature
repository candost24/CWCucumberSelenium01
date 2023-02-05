Feature: Parametreli step kullanımı


  Scenario: Cucumber step definition(cucumber edition)

    Given ilk sayi 5
    And ikinci sayi 3
    When Bu sayilari + operatorune sokarsam
    Then  sonuc 8 olmadir



  Scenario Outline: Cucumber step definition(Cucumber Edition)
    Given ilk sayi <sayi1>
    And ikinci sayi <sayi2>
    When Bu sayilari <operator> operatorune sokarsam
    Then sonuc <sonuc> olmadir
    Examples:
      | sayi1 | sayi2 | operator | sonuc |
      | 10    | 15    | +        | 25    |
      | 5     | 2     | -        | 3     |
      | 4     | 7     | *        | 26    |
      | 9     | 2     | /        | 4     |
  Scenario: Cucumber step definition (Regex Edition)