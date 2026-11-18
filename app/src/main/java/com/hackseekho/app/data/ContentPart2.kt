package com.hackseekho.app.data

object ContentPart2 {
    val modules: List<Module> = listOf(
        Module(
            id = "m6",
            number = 6,
            title = "Web Security Ki Bunyaad",
            subtitle = "Websites kaise kaam karti hain aur un ke khatron se bachao",
            iconKey = "web",
            lessons = listOf(
                Lesson(
                    id = "m6l1",
                    title = "Website Kaise Kaam Karti Hai",
                    body = """Jab aap browser mein kisi website ka naam likhte hain, to aap ka computer us website ke server ko ek request bhejta hai. Server ek aisa computer hota hai jo hamesha on rehta hai aur website ka data rakhta hai. Request milne par server website ka page wapas bhejta hai aur aap ka browser use dikha deta hai.

Is safar mein teen cheezein shamil hoti hain. Pehli cheez aap ka browser hai, jaise Chrome ya Firefox. Doosri cheez internet hai, jo request ko server tak le jata hai. Teesri cheez server hai, jo website ko chalata hai aur data deta hai.

Website ka page aam tor par teen hisson se banta hai. HTML page ki banawat banata hai, CSS use khoobsurat banata hai aur JavaScript use interactive banata hai. Jab aap kisi button par click karte hain ya form bharte hain, to browser phir server se baat karta hai.

Ye samajhna zaroori hai kyun ke security ki kamzori aksar inhi jagahon par hoti hai jahan browser aur server ke darmiyan data aata jata hai. Agar aap ye bunyaad samajh lein, to aage ke lessons mein SQL injection aur XSS ko samajhna bahut aasan ho jayega."""
                ),
                Lesson(
                    id = "m6l2",
                    title = "Server Aur Database Ka Taaruf",
                    body = """Server ke peeche aksar ek database hota hai. Database ek aisi jagah hai jahan website apna data mehfooz rakhti hai, jaise users ke naam, articles, products ki qeematein aur comments. Jab aap website par kuch search karte hain, to server database se jawab dhoondh kar aap ko dikhata hai.

Misal ke taur par, agar aap kisi online dukaan par joota search karte hain, to server database mein dekhta hai ke kaun se joote maujood hain aur un ki qeemat kya hai. Phir wo result aap ke browser ko bhejta hai. Ye sab kuch chand seconds mein hota hai.

Database mein data tables ki shakal mein rakha jata hai. Har table mein rows aur columns hote hain, bilkul spreadsheet ki tarah. Ek table mein users ka data hota hai, doosri mein products ka aur teesri mein orders ka. Server in tables se zaroori data nikalta hai.

Database ko secure rakhna bahut zaroori hai kyun ke is mein aksar sensitive data hota hai. Isi liye achhi websites database tak seedha rasta nahi deti, sirf server ke zariye control shuda tareeqe se data nikalti hain."""
                ),
                Lesson(
                    id = "m6l3",
                    title = "SQL Injection Kya Hai",
                    body = """SQL injection ek mashhoor web security kamzori hai. Is ka matlab hai ke koi shakhs website ke form ya search box mein aisa data daal deta hai jo database ke sawal ko badal deta hai. Server samajhta hai ke ye aam data hai, lekin asal mein wo database ko galat hukm de raha hota hai.

Is se hamla karne wala wo data dekh sakta hai jo use nahi dekhna chahiye, jaise doosre users ki maloomat. Kuch cases mein wo data badal bhi sakta hai ya delete bhi kar sakta hai. Ye ek khatarnak kamzori hai aur isi liye developers ko is se bachna sikhaya jata hai.

Is lesson mein hum sirf ye samajh rahe hain ke SQL injection kya hoti hai aur kyun khatarnak hai. Hum koi attack tareeqa, koi example attack string aur koi tool nahi sikha rahe. Ye seekhna sirf is liye hai ke aap is khatre ko pehchan sakein aur is se bacha ja sake.

Is se bachne ka sab se behtareen tareeqa parameterized queries hain. Is mein user ka data aur database ka hukm alag alag rakhe jate hain, taa ke data kabhi hukm na ban sake. Is ke saath input validation bhi zaroori hai, yani user se jo data aaye use check karna ke wo sahi type aur sahi format ka hai."""
                ),
                Lesson(
                    id = "m6l4",
                    title = "XSS Kya Hai",
                    body = """XSS ka matlab hai Cross-Site Scripting. Ye ek aisi kamzori hai jismein koi shakhs website par aisa code daal deta hai jo doosre users ke browser mein chal jata hai. Misal ke taur par, agar kisi website ke comment box mein galat code daal diya jaye aur website use check kiye baghair dikha de, to wo code har us user ke browser mein chalega jo wo comment dekhega.

Is se hamla karne wala jhooti maloomat dikha sakta hai, user ko dhoka de sakta hai ya user ka session chura sakta hai. Session ka matlab hai wo login shuda halat jis mein website aap ko pehchan ti hai. Isi liye XSS ko halka nahi lena chahiye.

Is lesson mein hum sirf taaruf seekh rahe hain, koi attack tareeqa ya example code nahi. Maqsad ye hai ke aap samajh sakein ke ye kamzori kyun banti hai aur is se bachao kaise mumkin hai. Jitna aap samjhenge, utna hi aap secure websites bana aur istemal kar sakenge.

Is se bachne ke liye websites ko user ke data ko dikhane se pehle saaf karna chahiye, jise output encoding kehte hain. Is ke saath Content Security Policy bhi istemal hoti hai, jo browser ko batati hai ke kaun sa code chalne ki ijazat hai. Dono tareeqe mil kar XSS se bachao karte hain."""
                ),
                Lesson(
                    id = "m6l5",
                    title = "Website Ko Secure Kaise Rakhte Hain",
                    body = """Website ko secure rakhne ke liye kuch aasan usool hain. Pehla usool ye hai ke user se jo bhi data aaye, use kabhi blind trust na karein. Har input ko check karein ke wo sahi type, sahi lambai aur sahi format ka hai. Ise input validation kehte hain aur ye har secure website ki pehli hifazat hai.

Doosra usool ye hai ke database se baat karte waqt parameterized queries istemal karein. Is se user ka data kabhi database ka hukm nahi ban sakta, aur SQL injection ka khatra khatam ho jata hai. Teesra usool ye hai ke user ka data dikhane se pehle use saaf karein, taa ke XSS jaisi kamzori na ban sake.

Chautha usool ye hai ke website ko HTTPS par chalaya jaye, taa ke browser aur server ke darmiyan data encrypted rahe. Paanchwan usool ye hai ke software aur libraries ko update rakha jaye, kyun ke purane versions mein maloom kamzoriyan hoti hain.

Agar aap sirf website istemal karte hain to aap ke liye sab se zaroori baat ye hai ke sirf bharaose wali websites par apna data dein, aur kabhi ajeeb links par click kar ke apni login maloomat na dein. Security sirf developer ki nahi, user ki bhi zimmedari hai."""
                )
            ),
            quiz = listOf(
                QuizQuestion(
                    question = "Browser website ka page kaise hasil karta hai?",
                    options = listOf(
                        "Server ko request bhej kar, server page wapas bhejta hai",
                        "Browser khud page bana leta hai",
                        "Page seedha database se aata hai",
                        "Page phone ki memory se aata hai"
                    ),
                    correctIndex = 0,
                    explanation = "Browser server ko request bhejta hai aur server website ka page wapas bhejta hai, jo browser dikha deta hai."
                ),
                QuizQuestion(
                    question = "Database mein data kis shakal mein rakha jata hai?",
                    options = listOf(
                        "Sirf photos ki shakal mein",
                        "Sirf videos ki shakal mein",
                        "Sirf text messages ki shakal mein",
                        "Tables, rows aur columns ki shakal mein"
                    ),
                    correctIndex = 3,
                    explanation = "Database mein data tables ki shakal mein rakha jata hai, jin mein rows aur columns hote hain, bilkul spreadsheet ki tarah."
                ),
                QuizQuestion(
                    question = "SQL injection kya hai?",
                    options = listOf(
                        "Website ka design badalne ka tareeqa",
                        "Internet ki speed barhane ka tareeqa",
                        "Aisi kamzori jismein galat data database ke sawal ko badal deta hai",
                        "Database ko fast karne ka tareeqa"
                    ),
                    correctIndex = 2,
                    explanation = "SQL injection mein galat data database ke sawal ko badal deta hai, jis se ghalat data dekha ya badla ja sakta hai."
                ),
                QuizQuestion(
                    question = "SQL injection se bachne ka behtareen tareeqa kya hai?",
                    options = listOf(
                        "Database ko delete kar dena",
                        "Parameterized queries istemal karna",
                        "Website ka rang badal dena",
                        "Password chhota rakhna"
                    ),
                    correctIndex = 1,
                    explanation = "Parameterized queries mein user ka data aur database ka hukm alag rakhe jate hain, is liye data kabhi hukm nahi ban sakta."
                ),
                QuizQuestion(
                    question = "XSS se bachne ke liye kya karna chahiye?",
                    options = listOf(
                        "User ka data dikhane se pehle use saaf karna aur Content Security Policy istemal karna",
                        "Website par comments band kar dena hamesha ke liye",
                        "Browser ko uninstall kar dena",
                        "Internet band kar dena"
                    ),
                    correctIndex = 0,
                    explanation = "Output encoding user ke data ko saaf karti hai aur Content Security Policy batati hai ke kaun sa code chal sakta hai."
                )
            )
        ),
        Module(
            id = "m7",
            number = 7,
            title = "Wi-Fi Security",
            subtitle = "Apna router aur apna Wi-Fi secure karna seekhein",
            iconKey = "wifi",
            lessons = listOf(
                Lesson(
                    id = "m7l1",
                    title = "Wi-Fi Kya Hai Aur Kaise Kaam Karta Hai",
                    body = """Wi-Fi ek wireless technology hai jo aap ke devices ko bina taar ke internet se jorti hai. Aap ka router ek chhota sa device hai jo internet ko Wi-Fi signals ki shakal mein aap ke ghar mein phelata hai. Aap ka phone, laptop ya tablet in signals ko pakar kar internet se jur jata hai.

Router ke signals ki ek had hoti hai. Aam tor par ghar ke andar signals achhe hote hain, lekin deewarein aur doori signals ko kamzor kar deti hai. Router ke qareeb signal mazboot hota hai aur door ja kar kamzor ho jata hai.

Jab aap Wi-Fi se jurte hain, to aap ka device aur router ke darmiyan ek connection banta hai. Is connection par data aata jata hai, jaise websites, videos aur messages. Agar ye connection secure na ho, to qareeb mein maujood koi shakhs aap ka data dekh sakta hai.

Isi liye Wi-Fi security bahut zaroori hai. Is module mein hum seekhenge ke apna router kaise secure karein, mazboot password kaise rakhein, public Wi-Fi ke khatre kya hain aur VPN kya hota hai. Ye sab aasan steps hain jo har koi apna sakta hai."""
                ),
                Lesson(
                    id = "m7l2",
                    title = "Apna Router Secure Karna",
                    body = """Router ko secure karne ka pehla step us ka admin password badalna hai. Aksar routers par pehle se ek default password hota hai jo sab ko maloom hota hai, jaise admin ya password. Agar aap ne ye password nahi badla, to koi bhi aap ke router ki settings mein ja sakta hai. Is liye pehle kaam ye karein ke admin password ko ek mazboot aur unique password se badal dein.

Doosra step ye hai ke router ka software, jise firmware kehte hain, update rakhein. Companies waqt ke saath security kamzoriyan theek karti hain aur naye updates deti hain. Purana firmware istemal karna aise hai jaise darwaze ka taala toota hua ho aur aap use theek na karein.

Teesra step ye hai ke router par WPA2 ya WPA3 security on rakhein. Ye wo encryption hai jo aap ke Wi-Fi data ko mehfooz rakhti hai. Kabhi bhi WEP ya open network istemal na karein kyun ke wo bilkul mehfooz nahi hain.

Chautha step ye hai ke apne Wi-Fi ka naam, jise SSID kehte hain, aisa rakhein jo aap ki pehchan na bataye. Apna naam ya ghar ka pata Wi-Fi ke naam mein na likhein. Ye chhote steps mil kar aap ke ghar ke network ko bahut mazboot bana dete hain."""
                ),
                Lesson(
                    id = "m7l3",
                    title = "Mazboot Wi-Fi Password",
                    body = """Wi-Fi ka password aap ke ghar ke network ki chabi hai. Agar password kamzor hai, to koi bhi aap ke Wi-Fi se jur sakta hai, aap ka internet istemal kar sakta hai aur aap ka data dekh sakta hai. Is liye mazboot password rakhna bahut zaroori hai.

Mazboot password lamba hota hai, kam se kam 12 se 16 characters ka. Is mein bare aur chhote haroof, numbers aur symbols milay hon, jaise a, B, 7, aur dollar ka nishan. Aasan password jaise 12345678, password ya apna naam kabhi na rakhein, kyun ke ye seconds mein guess ho jate hain.

Apne Wi-Fi ka password kisi aur jagah ke password jaisa na rakhein. Har jagah ka alag password hona chahiye. Agar ek jagah ka password leak ho jaye, to baqi jagah mehfooz rehti hain. Apna Wi-Fi password sirf ghar walon aur bharaose wale mehmano ko dein.

Password ko waqtan fawaqtan badalte rehna bhi achhi aadat hai, khaas tor par jab koi mehman chala jaye ya aap ko shak ho ke password kisi ghalat shakhs tak pahunch gaya hai. Router ki settings mein ja kar password badalna aasan hai aur sirf chand minute lagte hain."""
                ),
                Lesson(
                    id = "m7l4",
                    title = "Public Wi-Fi Ke Khatre",
                    body = """Public Wi-Fi wo Wi-Fi hota hai jo cafe, hotel, airport ya mall mein muft milta hai. Ye sahulat to deta hai, lekin is ke khatre bhi hain. Public Wi-Fi par aksar encryption nahi hoti ya kamzor hoti hai, is liye usi network par maujood koi shakhs aap ka data dekh sakta hai.

Sab se bara khatra ye hai ke koi shakhs jhoota Wi-Fi network bana sakta hai jo asal network jaisa lagta hai. Misal ke taur par, cafe ke naam se milta julta network bana kar logon ko phasaya ja sakta hai. Jab aap is jhoote network se jurte hain, to aap ka data us shakhs ke paas se guzarta hai.

Public Wi-Fi par kabhi bhi bank account, online payment ya zaroori login na karein. Agar zaroorat par jaye, to apne mobile data ka istemal karein, jo public Wi-Fi se zyada mehfooz hota hai. Aur agar aap ko public Wi-Fi istemal karna hi hai, to VPN on kar lein, jo aap ke data ko mehfooz rakhta hai.

Jab kaam khatam ho jaye, to public Wi-Fi se disconnect kar dein aur apne device ko auto-connect se hata dein, taa ke wo khud ba khud us network se na jur jaye. Ye aasan aadat aap ko bare nuqsan se bacha sakti hai."""
                ),
                Lesson(
                    id = "m7l5",
                    title = "VPN Ka Taaruf",
                    body = """VPN ka matlab hai Virtual Private Network. Ye ek aisi service hai jo aap ke internet connection ko encrypted tunnel mein daal deti hai. Is ka matlab ye hai ke aap ka data ek mehfooz rasta se guzarta hai aur beech mein koi use parh nahi sakta. Aap ka asli location bhi chhup jata hai.

VPN khaas tor par tab kaam aata hai jab aap public Wi-Fi istemal kar rahe hon. Us waqt aap ka data asani se dekha ja sakta hai, lekin VPN on ho to wo encrypted ho jata hai. Isi tarah, agar aap kisi aisi jagah se internet istemal kar rahe hain jahan aap ko apni privacy ki fikar hai, to VPN madad karta hai.

VPN istemal karna aasan hai. Aap ko ek bharaose wali VPN app install karni hoti hai, us mein apna account banana hota hai aur phir sirf ek button dabana hota hai. Kuch VPN muft hote hain, lekin bharaose wali paid VPN aksar zyada mehfooz aur tez hoti hain.

Ye samajhna zaroori hai ke VPN aap ko har khatre se nahi bachata. Ye aap ke connection ko mehfooz rakhta hai, lekin agar aap khud phishing link par click kar dein ya ghalat file download kar lein, to VPN aap ko nahi bacha sakta. VPN sirf security ka ek hissa hai, poori security nahi."""
                )
            ),
            quiz = listOf(
                QuizQuestion(
                    question = "Router kya karta hai?",
                    options = listOf(
                        "Sirf phone charge karta hai",
                        "Sirf TV chalata hai",
                        "Sirf light deta hai",
                        "Internet ko Wi-Fi signals ki shakal mein ghar mein phelata hai"
                    ),
                    correctIndex = 3,
                    explanation = "Router internet ko Wi-Fi signals mein badal kar aap ke devices tak pahunchata hai."
                ),
                QuizQuestion(
                    question = "Router secure karne ka pehla step kya hai?",
                    options = listOf(
                        "Router ko chhupa dena",
                        "Router ka rang badal dena",
                        "Default admin password ko mazboot password se badal dena",
                        "Router ko band kar dena"
                    ),
                    correctIndex = 2,
                    explanation = "Default password sab ko maloom hota hai, is liye use foran mazboot aur unique password se badalna chahiye."
                ),
                QuizQuestion(
                    question = "Wi-Fi ke liye kaun si security behtareen hai?",
                    options = listOf(
                        "Koi security nahi",
                        "WPA2 ya WPA3",
                        "WEP",
                        "Open network, bina password ke"
                    ),
                    correctIndex = 1,
                    explanation = "WPA2 ya WPA3 aap ke Wi-Fi data ko encrypt karte hain, jab ke WEP aur open network mehfooz nahi hain."
                ),
                QuizQuestion(
                    question = "Public Wi-Fi par kya nahi karna chahiye?",
                    options = listOf(
                        "Bank account ya online payment karna",
                        "Aam websites dekhna",
                        "Mausam check karna",
                        "Khabrein parhna"
                    ),
                    correctIndex = 0,
                    explanation = "Public Wi-Fi par data dekha ja sakta hai, is liye bank ya payment jaise sensitive kaam us par kabhi nahi karne chahiye."
                ),
                QuizQuestion(
                    question = "VPN kya karta hai?",
                    options = listOf(
                        "Internet ki speed hamesha double kar deta hai",
                        "Phone ki battery barha deta hai",
                        "Har virus ko khud delete kar deta hai",
                        "Internet connection ko encrypted tunnel mein daal kar data mehfooz rakhta hai"
                    ),
                    correctIndex = 3,
                    explanation = "VPN aap ke data ko encrypt karta hai aur aap ki location chhupata hai, khaas tor par public Wi-Fi par ye bahut kaam aata hai."
                )
            )
        ),
        Module(
            id = "m8",
            number = 8,
            title = "Social Engineering Se Bachao",
            subtitle = "Dhoke wale tareeqon ko pehchan-na aur un se bachna",
            iconKey = "people",
            lessons = listOf(
                Lesson(
                    id = "m8l1",
                    title = "Social Engineering Kya Hai",
                    body = """Social engineering ka matlab hai logon ko dhoka de kar un se maloomat ya paisa nikalna. Is mein koi computer hack nahi hota, balki insaan ko bewakoof banaya jata hai. Hamla karne wala aisa behave karta hai ke aap us par bharaosa kar lein, phir wo aap se password, bank details ya koi aur zaroori cheez mang leta hai.

Is ki sab se bari wajah ye hai ke insaan aam tor par madad karna chahta hai aur doosron par bharaosa karta hai. Hamla karne wale isi achhi aadat ka faida uthate hain. Wo aap ko darate hain, jaldi karne par majboor karte hain ya lalach dete hain taa ke aap soche samjhe baghair faisla kar lein.

Social engineering kai tareeqon se hoti hai. Kabhi phone call aati hai, kabhi email ya message aata hai aur kabhi koi shakhs khud saamne aa kar dhoka deta hai. Har tareeqe mein ek hi cheez aam hai, aap ko jaldi mein aur dar mein faisla karne par majboor karna.

Is module mein hum in tareeqon ko pehchan-na seekhenge. Jitna aap in ko jaanenge, utna hi aap ke liye dhoke se bachna aasan hoga. Yaad rakhein, koi bhi asli company ya bank aap se kabhi phone par password nahi mangta."""
                ),
                Lesson(
                    id = "m8l2",
                    title = "Phone Call Aur Fake Support",
                    body = """Phone par dhoka dena social engineering ka sab se aam tareeqa hai. Aap ko ek call aati hai aur bolne wala kehta hai ke wo bank, mobile company ya kisi mashhoor company ki support team se hai. Wo kehta hai ke aap ke account mein masla hai aur use foran theek karna hai. Phir wo aap se password, OTP ya bank details mangta hai.

Asli companies aisi maloomat kabhi phone par nahi mangtin. Agar koi call par aap se password ya OTP mange, to samajh lein ke wo dhoka hai. OTP ka matlab hai One Time Password, jo sirf aap ke liye hota hai aur use kisi ko bhi nahi dena chahiye, chahe wo kitna bhi bharaose wala kyun na lage.

Ek aur aam tareeqa ye hai ke call karne wala kehta hai ke aap ne koi prize jeeta hai ya aap ka parcel aaya hai. Phir wo aap se fees ya details mangta hai. Asli prize mein aap se kabhi paisa nahi manga jata. Agar koi prize ke naam par paisa mange, to wo dhoka hai.

Agar aap ko aisi call aaye, to ghbraein nahi. Call band kar dein aur company ke official number par khud call kar ke pooch lein. Number hamesha company ki official website se lein, na ke usi message ya call se jo aap ko shak mein daal rahi hai."""
                ),
                Lesson(
                    id = "m8l3",
                    title = "Urgent Messages Aur Dar Ka Istemal",
                    body = """Dhoka dene wale aksar aap ko jaldi aur dar mein daal kar faisla karwate hain. Aap ko aisa message aata hai ke aap ka account band hone wala hai, aap ka package ruk gaya hai ya aap ko foran paisa bhejna hai. Message mein likha hota hai ke sirf chand minute hain, abhi action lein warna nuqsan hoga.

Dar mein insaan ka dimagh sahi se kaam nahi karta. Hamla karne wala yehi chahta hai ke aap soche baghair link par click kar dein ya apni details bhej dein. Isi liye urgent message dekh kar pehla kaam ye karein ke rukein aur gehra saans lein. Koi bhi asli company aap ko do minute mein faisla karne par majboor nahi karti.

Aise messages mein aksar ajeeb links hote hain jo asal website jaisi lagti hain, lekin asal mein nakli hoti hain. Link par click karne se pehle hamesha poora address check karein. Agar address mein ghalat spelling hai ya ajeeb lafz hain, to wo dhoka hai.

Yaad rakhein, agar koi message aap ko daraye ya jaldi karne par majboor kare, to ye khud ek nishani hai ke kuch ghalat hai. Aaram se company ki official website ya app khol kar khud check karein, message ke link se kabhi na jayein."""
                ),
                Lesson(
                    id = "m8l4",
                    title = "Dhoke Ko Pehchan-na",
                    body = """Dhoke ko pehchan-ne ke liye kuch nishaniyan yaad rakhein. Pehli nishani hai ajeeb sender. Email ya message kisi anjaan address se aaya ho, ya company ke naam mein halki si ghalati ho, jaise aik haroof badla hua ho. Asli company apne official address se hi message bhejti hai.

Doosri nishani hai ghalat language. Dhoke wale messages mein aksar spelling ki ghaltiyan hoti hain, ajeeb jumle hote hain ya aap ka naam ghalat likha hota hai. Asli companies apne messages ko achhe se check kar ke bhejti hain. Agar message mein ajeeb Urdu ya English ho, to shak karein.

Teesri nishani hai ajeeb request. Agar koi aap se password, OTP, bank details ya paisa mange, to wo dhoka hai. Asli bank aur asli company aap se ye cheezein kabhi nahi mangti. Chauthi nishani hai lalach, jaise muft prize, bara inaam ya achanak paisa milne ka waada.

Paanchwi nishani hai ajeeb link ya attachment. Agar link ka address company se milta nahi, ya file download karne ko kaha jaye, to use kholein nahi. In nishaniyon mein se agar ek bhi nazar aaye, to rukein aur kisi bharaose wale shakhs se pooch lein."""
                ),
                Lesson(
                    id = "m8l5",
                    title = "Bachao Ke Aasan Tareeqe",
                    body = """Social engineering se bachne ke aasan tareeqe hain jo har koi apna sakta hai. Pehla tareeqa hai rukein aur sochein. Koi bhi message ya call aap se foran faisla nahi karwa sakti. Agar koi jaldi ka dabao daale, to yehi sab se bara ishara hai ke kuch ghalat hai. Aaram se sochein aur kisi se mashwara lein.

Doosra tareeqa hai verify karein. Agar koi kehta hai ke wo bank se hai, to call band kar ke bank ke official number par khud call karein. Agar email mein account band hone ki khabar hai, to company ki official app ya website khol kar khud check karein. Kabhi bhi message mein diye gaye link ya number se verify na karein.

Teesra tareeqa hai apni maloomat mehfooz rakhein. Password aur OTP kabhi kisi ko na dein, chahe wo kitna bhi bharaose wala kyun na lage. Apni personal maloomat social media par bhi zyada share na karein, kyun ke dhoka dene wale isi maloomat se aap par bharaosa banate hain.

Chautha tareeqa hai apne aas paas ke logon ko bhi sikhaein. Apne ghar walon, khaas tor par buzurgon aur bachon ko batayein ke aise dhoke kaise hote hain. Agar aap dhoke ka shikar ho jayein, to sharmayein nahi, foran bank aur police ko batayein. Jitni jaldi batayenge, utna hi nuqsan kam hoga."""
                )
            ),
            quiz = listOf(
                QuizQuestion(
                    question = "Social engineering kya hai?",
                    options = listOf(
                        "Website ka design banana",
                        "Internet ki speed barhana",
                        "Logon ko dhoka de kar un se maloomat ya paisa nikalna",
                        "Computer ka software update karna"
                    ),
                    correctIndex = 2,
                    explanation = "Social engineering mein computer hack nahi hota, balki insaan ko dhoka de kar us se maloomat ya paisa nikala jata hai."
                ),
                QuizQuestion(
                    question = "Agar koi phone par aap se OTP mange to kya karna chahiye?",
                    options = listOf(
                        "OTP social media par likh dein",
                        "OTP kabhi na dein aur call band kar dein",
                        "Foran OTP de dein",
                        "OTP kisi aur ko bhej dein"
                    ),
                    correctIndex = 1,
                    explanation = "OTP sirf aap ke liye hota hai aur asli companies kabhi phone par OTP nahi mangtin."
                ),
                QuizQuestion(
                    question = "Dhoka dene wale aksar kya karte hain?",
                    options = listOf(
                        "Aap ko dar aur jaldi mein daal kar foran faisla karwate hain",
                        "Aap ko aaram se sochne ka waqt dete hain",
                        "Aap ko official letter bhejte hain",
                        "Aap se kabhi paisa nahi mangte"
                    ),
                    correctIndex = 0,
                    explanation = "Dhoka dene wale dar aur jaldi ka istemal karte hain taa ke aap soche baghair faisla kar lein."
                ),
                QuizQuestion(
                    question = "Dhoke wale message ki ek aam nishani kya hai?",
                    options = listOf(
                        "Sahi spelling aur official address",
                        "Aap ka sahi naam likha hona",
                        "Message ka waqt par aana",
                        "Ajeeb sender, spelling ki ghaltiyan ya password mangna"
                    ),
                    correctIndex = 3,
                    explanation = "Ajeeb sender, spelling ki ghaltiyan aur password ya OTP mangna dhoke ki saaf nishaniyan hain."
                ),
                QuizQuestion(
                    question = "Kisi shak wale message ko verify karne ka sahi tareeqa kya hai?",
                    options = listOf(
                        "Message ka jawab de kar pooch lein",
                        "Message ko sab ko forward kar dein",
                        "Company ki official website ya app khol kar khud check karein",
                        "Message mein diye gaye link par click karein"
                    ),
                    correctIndex = 2,
                    explanation = "Hamesha company ki official website ya app se khud check karein, message ke link ya number se kabhi nahi."
                )
            )
        ),
        Module(
            id = "m9",
            number = 9,
            title = "Bug Bounty Ka Taaruf",
            subtitle = "HackerOne, Bugcrowd aur responsible disclosure seekhein",
            iconKey = "bug",
            lessons = listOf(
                Lesson(
                    id = "m9l1",
                    title = "Bug Bounty Kya Hai",
                    body = """Bug bounty ka matlab hai ke companies un logon ko inaam deti hain jo un ki website ya app mein security ki kamzori dhoondh kar report karte hain. Bug ka matlab hai ghalati ya kamzori, aur bounty ka matlab hai inaam. Companies ye program is liye chalati hain taa ke achhe hackers un ki madad karein aur ghalat hackers se pehle kamzori theek ho jaye.

Ye program sirf un logon ke liye hota hai jo rules follow karte hain. Aap ko sirf us website ya app ko test karna hota hai jo program mein shamil ho, aur sirf un tareeqon se jo program ne allow kiye hon. Is ke badle mein company aap ko paisa, certificate ya shukriya deti hai. Kuch log yehi kaam full time karte hain aur achha kama lete hain.

Bug bounty seekhne ke liye aap ko pehle web security ki bunyaad samajhni hoti hai, jo hum ne module 6 mein seekhi. Is ke saath aap ko responsible tareeqe se report likhna bhi aana chahiye. Is module mein hum seekhenge ke bug bounty kya hai, HackerOne aur Bugcrowd kya hain aur achhi report kaise likhte hain.

Yaad rakhein, bug bounty ka matlab ye nahi ke aap kisi bhi website ko apni marzi se test karne lag jayein. Bina permission ke testing hamesha ghalat hai aur qanoon ke khilaf ho sakti hai. Sirf un programs mein hissa lein jo khule aam invite karte hain."""
                ),
                Lesson(
                    id = "m9l2",
                    title = "HackerOne Aur Bugcrowd Ka Taaruf",
                    body = """HackerOne aur Bugcrowd do mashhoor platforms hain jo companies aur security researchers ko jorte hain. Companies apna bug bounty program in platforms par banati hain aur researchers wahan ja kar programs dhoondhte hain. Har program ke apne rules hote hain jin mein likha hota hai ke kya test kar sakte hain aur kya nahi.

HackerOne par bari bari companies apne programs chalati hain. Jab aap wahan account banate hain, to aap programs ki list dekh sakte hain, un ke rules parh sakte hain aur phir testing shuru kar sakte hain. Agar aap ko koi kamzori mile, to aap use usi platform par report karte hain aur company use check karti hai.

Bugcrowd bhi aise hi kaam karta hai. Is par bhi kai companies ke programs hote hain aur researchers un mein hissa lete hain. Dono platforms par aap apni profile bana sakte hain, apni reports ka record rakh sakte hain aur apni reputation barha sakte hain. Achhi reputation se aap ko zyada programs mein daakhle ka mauqa milta hai.

Shuruaat mein aap ko chhote programs se shuru karna chahiye aur sirf rules parh kar kaam karna chahiye. Pehle seekhna, phir practice karna aur phir report karna, yehi sahi raasta hai. Kabhi bhi rules ko nazar andaz na karein."""
                ),
                Lesson(
                    id = "m9l3",
                    title = "Responsible Disclosure Kya Hai",
                    body = """Responsible disclosure ka matlab hai ke agar aap ko kisi website ya app mein security ki kamzori mile, to aap use zimmedari se company ko batayein, na ke use ghalat istemal karein ya sab ke saamne bata dein. Is ka tareeqa ye hai ke pehle company ko private tor par report karein aur use theek karne ka waqt dein.

Is mein sab se zaroori baat ye hai ke kamzori milne ke baad aap use kisi aur ko na batayein, is se data chori na karein aur is se kisi ko nuqsan na pahunchayein. Aap ka maqsad madad karna hota hai, nuqsan pahunchana nahi. Company aap ki report ko check karti hai, kamzori theek karti hai aur phir aap ko shukriya ya inaam deti hai.

Responsible disclosure ke faide dono taraf hain. Company ki security behtar hoti hai aur researcher ko izzat aur inaam milta hai. Isi liye achhe hackers hamesha isi tareeqe se kaam karte hain. Jo log kamzori ko chhup kar ghalat istemal karte hain, wo hackers nahi, criminals hote hain.

Agar aap ko kisi aisi jagah kamzori mile jahan koi bug bounty program na ho, to phir bhi aap company ko us ke security contact ya support email par report kar sakte hain. Kabhi bhi kamzori ko public tor par share na karein jab tak company use theek na kar le."""
                ),
                Lesson(
                    id = "m9l4",
                    title = "Achhi Report Kaise Likhte Hain",
                    body = """Achhi report likhna bug bounty mein sab se zaroori skill hai. Company ko aap ki report se samajhna chahiye ke kamzori kya hai, wo kahan hai aur is se kya nuqsan ho sakta hai. Agar report saaf nahi hogi, to company use theek nahi kar payegi aur aap ko inaam bhi nahi milega.

Achhi report mein pehle title likhein jo saaf aur chhota ho. Phir likhein ke kamzori kahan mili, jaise kaun sa page ya kaun sa feature. Phir steps likhein ke aap ne kamzori kaise dekhi, lekin sirf wohi steps jo program ke rules allow karte hon. Har step saaf aur number ke saath likhein taa ke company use dohra kar dekh sake.

Is ke baad likhein ke is kamzori se kya nuqsan ho sakta hai, jaise data leak ya account ka khatra. Aakhir mein apni salah bhi dein ke is ko kaise theek kiya ja sakta hai, jaise input validation ya parameterized queries. Ye salah dikhati hai ke aap ne soch samajh kar report likhi hai.

Report mein hamesha sach likhein aur zyada barha charha kar na likhein. Agar kamzori chhoti hai, to use chhota hi batayein. Iman daari se likhi gayi report hi aap ki reputation banati hai."""
                ),
                Lesson(
                    id = "m9l5",
                    title = "Permission Ke Baghair Testing Kabhi Nahi",
                    body = """Bug bounty aur ethical hacking ka sab se zaroori usool ye hai ke permission ke baghair testing kabhi nahi karni. Sirf wohi website ya app test karein jo khule aam invite karti ho ya jis ke malik ne aap ko likh kar ijazat di ho. Bina ijazat ke kisi ki website ko test karna qanoon ke khilaf ho sakta hai, chahe aap ka irada achha hi kyun na ho.

Kai naye seekhne wale ye ghalati karte hain ke wo mashhoor websites ko test karne lag jate hain taa ke practice ho. Ye ghalat hai. Aap ko is se qanooni pareshani ho sakti hai, aap ka account band ho sakta hai aur aap ki reputation kharab ho sakti hai. Practice ke liye sirf wohi jagah istemal karein jo practice ke liye banayi gayi hon ya jin mein aap ko ijazat mili ho.

Har bug bounty program ke rules hote hain jin mein likha hota hai ke kya allowed hai aur kya nahi. Kuch cheezein hamesha mana hoti hain, jaise doosre users ka data dekhna, service ko band karna ya kisi ko nuqsan pahunchana. Rules ko parhe baghair testing shuru na karein.

Yaad rakhein, ethical hacker aur criminal mein farq sirf permission aur niyat ka hai. Ethical hacker hamesha ijazat le kar, rules ke andar reh kar aur madad ki niyat se kaam karta hai. Yehi wo pehchan hai jo aap ko aik acha security researcher banati hai."""
                )
            ),
            quiz = listOf(
                QuizQuestion(
                    question = "Bug bounty kya hai?",
                    options = listOf(
                        "Companies apna data bechti hain",
                        "Companies security kamzori dhoondhne aur report karne par inaam deti hain",
                        "Companies apni website band kar deti hain",
                        "Log muft mein website hack karte hain"
                    ),
                    correctIndex = 1,
                    explanation = "Bug bounty mein companies un logon ko inaam deti hain jo un ki website ya app ki kamzori dhoondh kar report karte hain."
                ),
                QuizQuestion(
                    question = "HackerOne aur Bugcrowd kya hain?",
                    options = listOf(
                        "Aise platforms jo companies aur security researchers ko jorte hain",
                        "Aise apps jo password chori karte hain",
                        "Aise websites jo muft movies deti hain",
                        "Aise tools jo computer hack karte hain"
                    ),
                    correctIndex = 0,
                    explanation = "HackerOne aur Bugcrowd par companies apne bug bounty programs banati hain aur researchers un mein hissa lete hain."
                ),
                QuizQuestion(
                    question = "Responsible disclosure ka matlab kya hai?",
                    options = listOf(
                        "Kamzori ko foran social media par bata dena",
                        "Kamzori ko chhupa kar ghalat istemal karna",
                        "Kamzori ko kisi ko bhi na batana",
                        "Kamzori milne par use private tor par company ko batana aur theek karne ka waqt dena"
                    ),
                    correctIndex = 3,
                    explanation = "Responsible disclosure mein kamzori private tor par company ko report ki jati hai aur use theek karne ka waqt diya jata hai."
                ),
                QuizQuestion(
                    question = "Achhi bug report mein kya hona chahiye?",
                    options = listOf(
                        "Sirf company ki burai",
                        "Sirf paisa mangna",
                        "Saaf title, kamzori ki jagah, steps, nuqsan aur theek karne ki salah",
                        "Sirf aik lafz, jaise bug hai"
                    ),
                    correctIndex = 2,
                    explanation = "Achhi report mein title, jagah, steps, nuqsan aur theek karne ki salah hoti hai taa ke company use samajh kar theek kar sake."
                ),
                QuizQuestion(
                    question = "Kisi website ko test karne se pehle kya zaroori hai?",
                    options = listOf(
                        "Sirf raat ko test karna",
                        "Us ke malik ki permission ya khula bug bounty program",
                        "Kuch bhi nahi, kisi bhi website ko test kar sakte hain",
                        "Sirf apna irada achha hona"
                    ),
                    correctIndex = 1,
                    explanation = "Bina permission ke testing qanoon ke khilaf ho sakti hai, chahe irada achha hi kyun na ho."
                )
            )
        ),
        Module(
            id = "m10",
            number = 10,
            title = "Practice Labs Aur Final Quiz",
            subtitle = "Jo seekha use practice karein aur apni tayyari check karein",
            iconKey = "school",
            lessons = listOf(
                Lesson(
                    id = "m10l1",
                    title = "Sab Kuch Dohraen",
                    body = """Is aakhri module mein hum wo sab kuch dohra rahe hain jo aap ne is course mein seekha hai. Pehle module mein aap ne ethical hacking ka matlab seekha aur ye samjha ke sirf jayez hacking seekhna aur apni security check karna hi sahi hai. Doosre modules mein aap ne networking, Linux, password security aur phishing ke bare mein seekha.

Phir aap ne web security ki bunyaad seekhi, jaise websites kaise kaam karti hain, SQL injection aur XSS kya hain aur un se bachao kaise hota hai. Us ke baad aap ne Wi-Fi security seekhi, apna router secure karna, mazboot password rakhna aur public Wi-Fi ke khatron se bachna. Phir social engineering aur bug bounty ke bare mein seekha.

Ab waqt hai practice ka. Is module ke labs mein aap apni cheezein check karenge, jaise apna password, apna Wi-Fi aur phishing email ko pehchan-na. Sirf apni cheezon par, permission ke saath. Yehi ethical hacking ka usool hai aur is par hamesha amal karein.

Dohrai ka maqsad ye hai ke seekhi hui cheezein aap ke zehen mein mazboot ho jayein. Jab aap practice karenge, to aap ko samajh aayega ke konsa hissa aap ko achhe se aata hai aur kahan aap ko dobara parhne ki zaroorat hai. Phir aap final quiz de kar apni tayyari check kar sakte hain."""
                ),
                Lesson(
                    id = "m10l2",
                    title = "Lab: Apna Password Check Karna",
                    body = """Is lab mein aap apne passwords ko check karenge ke wo mazboot hain ya nahi. Sirf apni cheezon par, permission ke saath. Pehle apne sab se zaroori accounts ki list banayein, jaise email, bank aur social media. Phir har password ko is checklist se check karein.

Mazboot password kam se kam 12 se 16 characters ka hota hai. Is mein bare aur chhote haroof, numbers aur symbols milay hon. Agar aap ka password chhota hai, sirf naam ya date par hai, ya har jagah ek hi password hai, to use foran badal dein. Apne liye ek naya mazboot password banayein aur use password manager mein mehfooz rakhein.

Is lab mein aap password strength checker tool bhi istemal kar sakte hain jo is app mein diya gaya hai. Ye tool sirf aap ke password ki mazbooti batata hai, password ko kahin bhejta nahi. Aap apna asli password is tool mein daal kar dekh sakte hain ke wo kitna mazboot hai.

Jab aap apne passwords theek kar lein, to doosra step two-factor authentication on karna hai. Ye aap ke accounts ko ek aur hifazat deta hai. Is lab ke baad aap ke accounts pehle se zyada mehfooz honge. Apni is kamyabi ko note karein aur har chand mahine baad ye lab dobara karein."""
                ),
                Lesson(
                    id = "m10l3",
                    title = "Lab: Phishing Email Pehchan-na",
                    body = """Is lab mein aap phishing email ko pehchan-ne ki practice karenge. Sirf apni cheezon par, permission ke saath. Pehle apne inbox mein wo emails dekhein jo aap ko shak mein daalte hon, jaise koi prize, account band hone ki khabar ya ajeeb link wala message. Unhe kholein nahi, sirf un ki nishaniyan dekhein.

Har email ko is checklist se check karein. Pehle sender ka address dekhein, kya wo company ka official address hai ya ajeeb sa hai. Phir subject aur language dekhein, kya is mein spelling ki ghaltiyan hain ya aap ko daraya ja raha hai. Phir dekhein ke kya aap se password, OTP ya paisa manga ja raha hai.

Agar email mein link hai, to us par click na karein. Sirf mouse ya ungli se link ke address ko dekhein aur check karein ke wo asal website se milta hai ya nahi. Agar address mein ghalat spelling hai ya ajeeb lafz hain, to wo phishing hai. Aise email ko spam ya phishing report karein aur delete kar dein.

Is lab ko rozana ki aadat banayein. Har email kholne se pehle do second rukein aur ye teen sawal pooch lein. Kya ye sender asli hai, kya ye mujhe dar raha hai, aur kya ye mujh se sensitive cheez mang raha hai. Agar kisi sawal ka jawab shak wala ho, to email ko kholein nahi aur kisi bharaose wale shakhs se pooch lein."""
                ),
                Lesson(
                    id = "m10l4",
                    title = "Lab: Apna Wi-Fi Aur Fake Terminal Practice",
                    body = """Is lab mein aap do kaam karenge. Sirf apni cheezon par, permission ke saath. Pehla kaam apna Wi-Fi check karna hai. Apne router ki settings mein ja kar dekhein ke admin password default to nahi hai, WPA2 ya WPA3 on hai ya nahi, aur firmware update hai ya nahi. Agar koi cheez theek nahi, to use theek karein aur apna Wi-Fi password bhi check karein.

Doosra kaam fake terminal commands ki practice karna hai. Is app mein ek simulated terminal hai jo sirf safe aur nakli commands chalata hai. Is mein aap commands likh kar dekh sakte hain ke terminal kaise kaam karta hai, bina kisi khatre ke. Aap commands jaise help, list aur check likh kar practice kar sakte hain. Ye terminal asal system ko kuch nahi karta, sirf seekhne ke liye hai.

Dono kaam karne ke baad apne notes mein likhein ke aap ne kya seekha aur kya theek kiya. Apna Wi-Fi secure karna aur terminal ki bunyaad samajhna, dono aap ki security ki bunyaad hain. Is lab ko har chand mahine baad dobara karein taa ke aap ki security hamesha mazboot rahe.

Ab aap course ke aakhir mein hain. Aap ne ethical hacking ki bunyaad, networking, passwords, phishing, web security, Wi-Fi, social engineering aur bug bounty seekh liya hai. Final quiz de kar apni tayyari check karein aur jo hissa kamzor lage use dobara parhein."""
                )
            ),
            quiz = listOf(
                QuizQuestion(
                    question = "Practice labs mein sab se zaroori usool kya hai?",
                    options = listOf(
                        "Sirf apni cheezon par, permission ke saath",
                        "Kisi bhi website ko test karna",
                        "Doosron ke passwords check karna",
                        "Kisi bhi network ko scan karna"
                    ),
                    correctIndex = 0,
                    explanation = "Labs mein sirf apni cheezein check karni hain aur permission ke saath kaam karna hai, yehi ethical hacking ka usool hai."
                ),
                QuizQuestion(
                    question = "Mazboot password kaisa hota hai?",
                    options = listOf(
                        "Chhota aur yaad rakhne mein aasan, jaise 123456",
                        "Apna naam aur date of birth",
                        "Har jagah ek hi password",
                        "Lamba, haroof, numbers aur symbols mila hua aur har jagah alag"
                    ),
                    correctIndex = 3,
                    explanation = "Mazboot password kam se kam 12 se 16 characters ka hota hai, is mein haroof, numbers aur symbols hote hain aur har jagah alag hota hai."
                ),
                QuizQuestion(
                    question = "Phishing email pehchan-ne ka pehla step kya hai?",
                    options = listOf(
                        "Foran password bhej dena",
                        "Email ko sab ko forward kar dena",
                        "Sender ka address aur message ki nishaniyan check karna",
                        "Foran link par click karna"
                    ),
                    correctIndex = 2,
                    explanation = "Pehle sender ka address, spelling ki ghaltiyan aur password mangne jaisi nishaniyan check karein, link par click na karein."
                ),
                QuizQuestion(
                    question = "Apna Wi-Fi check karte waqt kya dekhna chahiye?",
                    options = listOf(
                        "Sirf Wi-Fi ka naam",
                        "Admin password default na ho, WPA2 ya WPA3 on ho aur firmware update ho",
                        "Sirf Wi-Fi ka rang",
                        "Sirf router ki qeemat"
                    ),
                    correctIndex = 1,
                    explanation = "Admin password badla hua hona, WPA2 ya WPA3 on hona aur firmware update hona apne Wi-Fi ki security ki bunyaad hain."
                ),
                QuizQuestion(
                    question = "Course khatam karne ke baad kya karna chahiye?",
                    options = listOf(
                        "Final quiz de kar tayyari check karein aur kamzor hisse dobara parhein",
                        "Sab kuch bhool jayein",
                        "Bina permission ke websites test karna shuru kar dein",
                        "Apna password sab ko bata dein"
                    ),
                    correctIndex = 0,
                    explanation = "Final quiz se pata chalta hai ke kya seekha hai aur kamzor hisse dobara parh kar tayyari mazboot ki ja sakti hai."
                )
            )
        )
    )
}
