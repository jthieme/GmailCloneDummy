package com.thieme.gmailclonedummy

import com.thieme.gmailclonedummy.model.Account
import com.thieme.gmailclonedummy.model.MailData

val mailList = listOf(
    MailData(
        id = 1,
        userName = "Christy",
        subject = "Weekly Android News",
        body = "Hello Christy we have got exciting addition  to the android api",
        timeStamp = "20:10"
    ),
    MailData(
        id = 2,
        userName = "Agatha",
        subject = "Job Application",
        body = "This is regarding a job opportunity I found on your website.",
        timeStamp = "20:10"
    ),
    MailData(
        id = 3,
        userName = "Cecilia",
        subject = "Flutter News",
        body = "Hello Cecilia we have got exciting addition  to the Flutter api",
        timeStamp = "20:10"
    ),
    MailData(
        id = 4,
        userName = "Angelo",
        subject = "Email regarding job opportunity",
        body = "This is regarding a job opportunity for the profile or android developer in our organisation.",
        timeStamp = "21:10"
    ),
    MailData(
        id = 5,
        userName = "Sam",
        subject = "New Event has been created",
        body = "A new event has been added to your dashboard go check it out",
        timeStamp = "20:10"
    ),
    MailData(
        id = 6,
        userName = "Medium",
        subject = "JetPack compose for beginners",
        body = "This article will teach you all the basics of jetpack compose.",
        timeStamp = "20:10"
    ),
    MailData(
        id = 7,
        userName = "Netflix",
        subject = "A new Device is using your account",
        body = "If you did not sign in with a new device then go to settings and reset your password",
        timeStamp = "20:10"
    ),
    MailData(
        id = 8,
        userName = "Collins",
        subject = "A request for partnership",
        body = "This is a follow up email about the partnership request",
        timeStamp = "20:50"
    ),
    MailData(
        id = 9,
        userName = "Amazon",
        subject = "Your account has been created",
        body = "If you did not sign in with a new device then go to settings and reset your password",
        timeStamp = "20:10"
    ),
    MailData(
        id = 10,
        userName = "Jobs",
        subject = "New opportunity that suits you",
        body = "We have an opening that suits your profile kindly check it out and indicate your interest",
        timeStamp = "20:10"
    )
)

val accountList = listOf<Account>(
    Account(icon = R.drawable.dream, userName = "Josh Thieme",
        email = "jomthieme@gmail.com", unReadMails = 99),
    Account(userName = "Bob Sagget", email = "saggetMan@gmail.com", unReadMails = 10),
    Account(userName = "Will Smith", email = "w.smith@gmail.com", unReadMails = 80),

    )