AL mesafe
AL yas
AL yolculukTipi

EĞER mesafe <= 0 YA DA yas <= 0 YA DA (yolculukTipi != 1 VEYA yolculukTipi != 2) 
    SONUCU YAZDIR "Hatalı Veri Girdiniz !"
DEĞİLSE
    normalTutar = mesafe * 0.10

    EĞER yas < 12
        yasIndirimOrani = 0.50
    DEĞİLSE EĞER yas >= 12 VE yas <= 24
        yasIndirimOrani = 0.10
    DEĞİLSE EĞER yas >= 65
        yasIndirimOrani = 0.30
    DEĞİLSE
        yasIndirimOrani = 0
    
    yasIndirimi = normalTutar * yasIndirimOrani

    indirimliTutar = normalTutar - yasIndirimi

    EĞER yolculukTipi == 2
        gedisDonusIndirimi = indirimliTutar * 0.20
    DEĞİLSE
        gedisDonusIndirimi = 0
    
    toplamTutar = (indirimliTutar - gedisDonusIndirimi) * (yolculukTipi == 2 ? 2 : 1)

    SONUCU YAZDIR "Toplam Tutar = " + toplamTutar + " TL"
