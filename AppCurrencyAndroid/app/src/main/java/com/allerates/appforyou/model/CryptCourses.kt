package com.allerates.appforyou.model

class CryptCourses (
    val MAID: Double,
    val XEM: Double,
    val ETH: Double,
    val DASH: Double,
    val XMR: Double,
    val LTC: Double,
    val BTC: Double,
    val XRP: Double,
    val ETC: Double,
    var AUR: Double
)

class RealCoin (
        var name: String,
        var shortName: String
)

fun getPairsCoin(): Array<RealCoin> {
    return arrayOf(
            RealCoin("United States", "USD"),
            RealCoin("Euro Member", "EUR"),
            RealCoin("United Kingdom", "GBP"),
            RealCoin("Japan", "JPY"),
            RealCoin("China", "CNY"),
            RealCoin("Russia", "RUB"),
            RealCoin("Australia", "AUD"),
            RealCoin("Canada", "CAD"),
            RealCoin("Poland", "PLN"),
            RealCoin("Singapore", "SGD"),
            RealCoin("Switzerland", "CHF"),
            RealCoin("India", "INR"),
            RealCoin("Brazil", "BRL"),
            RealCoin("South Africa", "ZAR"),
            RealCoin("Korea (South)", "KRW"),
            RealCoin("Viet Nam", "VND"),
            RealCoin("Sweden", "SEK"),
            RealCoin("Thailand", "THB"),
            RealCoin("Israel", "ILS"),
            RealCoin("Philippines", "PHP"),
            RealCoin("Ukraine", "UAH"),
            RealCoin("Indonesia", "IDR"),
            RealCoin("Czech Republic", "CZK"),
            RealCoin("Mexico", "MXN"),
            RealCoin("Denmark", "DKK"),
            RealCoin("Chile", "CLP"),
            RealCoin("Malaysia", "MYR"),
            RealCoin("Nigeria", "NGN"),
            RealCoin("Hungary", "HUF"),
            RealCoin("Mauritius", "MUR"),
            RealCoin("Romania", "RON"),
            RealCoin("Argentina", "ARS"),
            RealCoin("Cambodia", "KHR"),
            RealCoin("Peru", "PEN"),
            RealCoin("Nepal", "NPR"),
            RealCoin("Pakistan", "PKR"),
            RealCoin("Bahrain", "BHD"),
            RealCoin("Norway", "NOK"),
            RealCoin("Uganda", "UGX"),
            RealCoin("Colombia", "COP"),
            RealCoin("Ghana", "GHS"),
            RealCoin("United Arab Emirates", "AED"),
            RealCoin("Iran", "IRR"),
            RealCoin("Kenya", "KES"),
            RealCoin("Kazakhstan", "KZT"),
            RealCoin("Uzbekistan", "UZS"),
            RealCoin("Sri Lanka", "LKR"),
            RealCoin("Myanmar", "MMK"),
            RealCoin("Saudi Arabia", "SAR"),
            RealCoin("Qatar", "QAR"),
            RealCoin("Jamaica", "JMD"),
            RealCoin("Niger", "XOF"),
            RealCoin("Swaziland", "SZL"),
            RealCoin("Algeria", "DZD"),
            RealCoin("Brunei", "BND"),
            RealCoin("Kyrgyzstan", "KGS"),
            RealCoin("Azerbaijan", "AZN"),
            RealCoin("Lebanon", "LBP"),
            RealCoin("Kuwait", "KWD"),
            RealCoin("Gibraltar", "GIP"),
            RealCoin("Afghanistan", "AFN"),
            RealCoin("Serbia", "RSD"),
            RealCoin("Jordan", "JOD"),
            RealCoin("Taiwan", "TWD"),
            RealCoin("Iraq", "IQD"),
            RealCoin("Iceland", "ISK"),
            RealCoin("Albania", "ALL"),
            RealCoin("Bangladesh", "BDT"),
            RealCoin("Namibia", "NAD"),
            RealCoin("Belarus", "BYN"),
            RealCoin("Oman", "OMR"),
            RealCoin("Egypt", "EGP"),
            RealCoin("Antarctica", "XCD"),
            RealCoin("Bahamas", "BSD"),
            RealCoin("Barbados", "BBD"),
            RealCoin("Italian Lira", "ITL"),
            RealCoin("Seychelles", "SCR"),
            RealCoin("Turkmenistan", "TMT"),
            RealCoin("Hong Kong", "HKD"),
            RealCoin("New Zealand", "NZD"),
            RealCoin("Turkey", "TRY"),
            RealCoin("Georgia", "GEL"),
            RealCoin("Bulgaria", "BGN"),
            RealCoin("Tanzania", "TZS"),
            RealCoin("Croatia", "HRK"),
            RealCoin("Venezuela", "VEF"),
            RealCoin("Costa rica", "CRC"),
            RealCoin("Cuba", "CUC"),
            RealCoin("Africa", "XAF"),
            RealCoin("Guatemala", "GTQ"),
            RealCoin("Democratic Republic of Congo", "CDF"),
            RealCoin("Zimbabwe", "BWP"),
            RealCoin("Lesotho", "LSL"),
            RealCoin("Mozambique", "MZN"),
            RealCoin("Rwanda", "RWF"),
            RealCoin("Bolivia", "BOB"),
            RealCoin("Kingdom of Burundi", "BIF"),
            RealCoin("Angola", "AOA"),
            RealCoin("New Guinea", "PGK"),
            RealCoin("Malawi", "MWK"),
            RealCoin("Uruguay", "UYU"),
            RealCoin("Madagascar", "MGA"),
            RealCoin("Trinidad and Tobago", "TTD"),
            RealCoin("Guernsey", "GGP"),
            RealCoin("Vanuatu", "VUV"),
            RealCoin("Ethiopia", "ETB"),
            RealCoin("Moldavia", "MDL"),
            RealCoin("Zambia", "ZMW"),
            RealCoin("Morocco", "MAD"),
            RealCoin("Panama", "PAB"),
            RealCoin("Denmark", "DKKT"),
            RealCoin("Bosnia and Herzegovina", "BAM"),
            RealCoin("Paraguay", "PYG"),
            RealCoin("Tunisia", "TND"),
            RealCoin("Honduras", "HNL"),
            RealCoin("Macau", "MOP"),
            RealCoin("Dominican Republic", "DOP")
    )
}
//todo make this in database