#1. Apidemos'a girilir
#2. Preference tıklanır
#3. Preference dependencies tıklanır
#4. WiFi check box aktif edilir.
#5. Wifi Settings tıklanır
#6. Gelen ekrana 'Appium çok güzel' yazılır ve OK tıklanır
#7. Tekrar tıklayıp yazılan cümleyi dogrulayıp konsola yazdırınız

  @wifi
  Feature: Android
    Scenario: verify wifi text
      Given navigate to apidemos and click preferences
      Then click preference dependencies
      And activate wifi check box
      Then click wifi settings
      And write holder "thanks god appium has ended" and click ok
      Then verify written text in the holder

