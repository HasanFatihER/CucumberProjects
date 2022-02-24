Feature: US03parametreKullanimi
  @wip
  Scenario: TC03ParametreKullanimi

    Given kullanici amazon sayfasina gider
    And "java" icin arama yapar
    Then sonuclarin "java" icerdigini test eder
    And sayfa kapanır