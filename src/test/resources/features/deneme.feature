Feature: Google gidilir

  Background:kullanıcı her seneryoda google sayfasında olacaktır
    Given Kullanici gogle sayfasına gider




  Scenario: kullanıcı arama motorunda meze görmelidir
    When kullanici meze kelimesini arar
    Then kullnici meze kelimesinin geçtiğini doğrular



  Scenario: kullanıcı arama motorunda su görmelidir
    When kullanici su kelimesini arar
    Then kullnici su kelimesinin geçtiğini doğrular
