package uz.ali.finance98.repository

import uz.ali.finance98.R
import uz.ali.finance98.models.DataEarningModel
import uz.ali.finance98.models.Users

class DBdata {

    fun getDateName():ArrayList<DataEarningModel> {
        var list= arrayListOf<DataEarningModel>()
        list.add(DataEarningModel("Xalq bank","26 April 2011"))
        list.add(DataEarningModel("Pay Earning","29 March 2021"))
        list.add(DataEarningModel("Education","21 January 2021"))
        list.add(DataEarningModel("University","18 March 2020"))
        list.add(DataEarningModel("Comany","8 February 2020"))
        list.add(DataEarningModel("It cOMPANY","19 April 2019"))
        return list
    }
    fun getStinnerList():ArrayList<String>{
        return arrayListOf("Alibek","Sanjar","Ravshan","Ohun","Bek","Birodar")
    }


    fun getTitle(): ArrayList<String> {
        var listTitle = arrayListOf<String>()

        listTitle.add("Day")
        listTitle.add("Week")
        listTitle.add("Month")
        listTitle.add("Year")

        return listTitle
    }


    fun getList(): ArrayList<ArrayList<Users>> {
        var list = arrayListOf<ArrayList<Users>>()

        var listDay = arrayListOf<Users>()
        var listWeek = arrayListOf<Users>()
        var listMonth = arrayListOf<Users>()
        var listYear = arrayListOf<Users>()

        listDay.add(Users("Alibek Saymov", "32 transactions", "9,520"))
        listDay.add(Users("Sanjar Aybekov", "18 transactions", "7,45"))
        listDay.add(Users("Javshon Axmedov", "42 transactions", "3,50"))
        listDay.add(Users("Adil Azimov", "25 transactions", "5,520"))
        listDay.add(Users("Asadbek Bekmuratov", "50 transactions", "5,520"))
        listDay.add(Users("Jahon Bekmuratov", "89 transactions", "5,520"))
        listDay.add(Users("Birodar Egamberdiyer", "44 transactions", "5,520"))
        listDay.add(Users("Ohun Xidirov", "14 transactions", "5,520"))


        listWeek.add(Users("Alibek Saymov", "32 transactions", "9,520"))
        listWeek.add(Users("Sanjar Aybekov", "18 transactions", "7,45"))
        listWeek.add(Users("Javshon Axmedov", "42 transactions", "3,50"))
        listWeek.add(Users("Adil Azimov", "25 transactions", "5,520"))
        listWeek.add(Users("Asadbek Bekmuratov", "50 transactions", "5,520"))
        listWeek.add(Users("Jahon Bekmuratov", "89 transactions", "5,520"))
        listWeek.add(Users("Birodar Egamberdiyer", "44 transactions", "5,520"))
        listWeek.add(Users("Ohun Xidirov", "14 transactions", "5,520"))


        listMonth.add(Users("Alibek Saymov", "32 transactions", "9,520"))
        listMonth.add(Users("Sanjar Aybekov", "18 transactions", "7,45"))
        listMonth.add(Users("Javshon Axmedov", "42 transactions", "3,50"))
        listMonth.add(Users("Adil Azimov", "25 transactions", "5,520"))
        listMonth.add(Users("Asadbek Bekmuratov", "50 transactions", "5,520"))
        listMonth.add(Users("Jahon Bekmuratov", "89 transactions", "5,520"))
        listMonth.add(Users("Birodar Egamberdiyer", "44 transactions", "5,520"))
        listMonth.add(Users("Ohun Xidirov", "14 transactions", "5,520"))



        listYear.add(Users("Alibek Saymov", "32 transactions", "9,520"))
        listYear.add(Users("Sanjar Aybekov", "18 transactions", "7,45"))
        listYear.add(Users("Javshon Axmedov", "42 transactions", "3,50"))
        listYear.add(Users("Adil Azimov", "25 transactions", "5,520"))
        listYear.add(Users("Asadbek Bekmuratov", "50 transactions", "5,520"))
        listYear.add(Users("Jahon Bekmuratov", "89 transactions", "5,520"))
        listYear.add(Users("Birodar Egamberdiyer", "44 transactions", "5,520"))
        listYear.add(Users("Ohun Xidirov", "14 transactions", "5,520"))


        list.add(listDay)
        list.add(listWeek)
        list.add(listMonth)
        list.add(listYear)

        return list
    }

    fun getNames(): ArrayList<String> {
        return arrayListOf<String>(
            "Saymov Alibek",
            "Aybekov Sanjar",
            "Axmedov Ravshon",
            "Xidirov Oxun",
            "Saliev Farrux",
            "Baltabaev Alibek"
        )
    }

    fun getImage(): ArrayList<Int> {
        return arrayListOf(
            R.drawable.uz9, R.drawable.uz8,
            R.drawable.uz3,
            R.drawable.uz4, R.drawable.uz5, R.drawable.uz6
        )
    }
}