Feature: US02backround yontemi

# Background methodu BeforeMethod gibi çalışır.
  Background:AmazonSayfasına Gitme
    Given kullanici amazon sayfasina gider
     # Work in progress anlamı taşır. Şu an bu dosya ile ilgileniyorum anlamı taşır.

  Scenario: iPhone icin arama
    And iPhone icin arama yapar
    Then sonuclarin Iphone icerdigini test eder
    Given sayfa kapanır

  Scenario:tea pot icin arama
    And tea pot icin arama yapar
    Then sonuclarin tea pot icerdigini test eder
    Given sayfa kapanır

  Scenario:flower icin arama
    And flower icin arama yapar
    Then sonuclarin flower icerdigini test eder
    And sayfa kapanır