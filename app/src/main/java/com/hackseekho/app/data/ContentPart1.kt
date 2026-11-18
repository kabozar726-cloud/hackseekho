package com.hackseekho.app.data

object ContentPart1 {
    val modules: List<Module> = listOf(
        Module(
            id = "m1",
            number = 1,
            title = "Ethical Hacking Kya Hai",
            subtitle = "Hacking seekhna, qanoon ke andar reh kar",
            iconKey = "shield",
            lessons = listOf(
                Lesson(
                    id = "m1l1",
                    title = "Ethical Hacking Kya Hai?",
                    body = """Ethical hacking ka matlab hai kisi computer, website ya network ki kamzori ko achhi niyat se dhoondhna, taake usay waqt par theek kiya ja sake. Ethical hacker chor nahi hota. Woh malik ki permission se kaam karta hai aur jo kamzori milti hai, woh usay chhupa kar ghalat istemal nahi karta, balkay malik ko bata deta hai taake woh apni hifazat behtar kar sake.

Aam zindagi mein is ki misaal aik tala banane wale ki tarah hai. Tala banane wala tala ko kholna bhi janta hai, lekin woh apni salahiyat ka istemal sirf madad ke liye karta hai. Aik ethical hacker bhi aisi hi salahiyat rakhta hai. Woh system ko samajhta hai, us ki kamzor jagah dhoondhta hai aur phir us ka hal batata hai. Us ka maqsad nuqsan pahunchana nahi hota, balkay nuqsan se bachana hota hai.

Is course mein hum sirf wohi seekhenge jo qanooni hai aur jo aap ki apni hifazat ke kaam aaye. Hum kisi ka account, password ya phone hack karna nahi seekhenge. Hum seekhenge ke hacker kaise sochta hai, taake hum apne aap ko, apne ghar walon ko aur apne kaam ko behtar tareeqay se bacha saken. Sirf apni cheezon par, permission ke saath."""
                ),
                Lesson(
                    id = "m1l2",
                    title = "White Hat, Grey Hat, Black Hat",
                    body = """Hacker ki teen mashhoor qismein hain, aur in ko samajhna bohat zaroori hai. Pehli qisam white hat hacker hai. Yeh achha hacker hota hai. Woh permission le kar kaam karta hai, kamzori dhoondhta hai aur malik ko bata deta hai. Companies aise logon ko khud bulati hain aur unhen is kaam ke paise bhi deti hain, kyun ke yeh un ki hifazat karte hain.

Doosri qisam grey hat hacker hai. Yeh aadmi kabhi achha kaam karta hai aur kabhi ghalat. Woh aksar bina permission ke kisi system ki kamzori dhoondhta hai, phir malik ko bata deta hai aur kabhi paise bhi mangta hai. Bina permission ke andar jana, chahe niyat achhi ho, phir bhi ghalat hai aur qanoon ke khilaf ho sakta hai. Is liye grey hat rasta hamare liye nahi hai.

Teesri qisam black hat hacker hai. Yeh woh log hain jo chori, dhoka aur nuqsan ke liye hack karte hain. Woh password churata hain, paisa churate hain aur logon ki niji maloomat bechte hain. Yeh kaam jurm hai aur is ki saza jail bhi ho sakti hai. Hamara maqsad sirf white hat banna hai. Sirf apni cheezon par, permission ke saath."""
                ),
                Lesson(
                    id = "m1l3",
                    title = "Permission Kyun Zaroori Hai",
                    body = """Ethical hacking mein permission sab se pehli aur sab se bari shart hai. Permission ka matlab hai ke jis cheez ko aap check kar rahe hain, us ke malik ne aap ko likh kar ya saaf lafzon mein ijazat di ho. Bina permission ke kisi ki website, phone ya computer ko check karna, chahe aap sirf dekh hi rahe hon, ghalat hai. Niyat achhi hone se kaam theek nahi ho jata, ijazat hona zaroori hai.

Aap soch sakte hain ke kisi ke ghar ka darwaza khula ho to kya andar jana theek hai. Bilkul nahi. Darwaza khula hona ijazat nahi hoti. Isi tarah kisi website ki kamzori nazar aa jana bhi ijazat nahi hoti. Ijazat wohi hai jo malik khud de. Is liye seekhne ke liye sirf apni cheezein istemal karen, jaise apna phone, apna computer ya apna khud ka test account.

Jab bhi aap is course mein koi mashq karen, to pehle yeh yaqeen kar len ke woh cheez aap ki apni hai ya aap ko us ki ijazat mili hui hai. Agar shak ho, to woh kaam na karen. Yeh aik aadat hai jo aap ko hamesha mehfooz rakhe gi. Sirf apni cheezon par, permission ke saath."""
                ),
                Lesson(
                    id = "m1l4",
                    title = "Qanoon Kya Kehta Hai",
                    body = """Pakistan mein bhi computer se mutaliq qanoon mojood hai, jise Prevention of Electronic Crimes Act kehte hain. Is qanoon ke mutabiq kisi ke computer, account ya data mein bina ijazat dakhil hona jurm hai. Kisi ka password chura kar us ka account istemal karna, kisi ki tasveerein ya maloomat chura kar phelana, aur kisi ko dhoka de kar us se paisa lena, sab qanoon ke khilaf hain.

Duniya ke har mulk mein aise hi qanoon hain. Farq sirf itna hai ke har jagah saza aur tareeqa alag ho sakta hai. Lekin aik baat har jagah aik jaisi hai: bina permission ke andar jana jurm hai, chahe aap ne kuch churaaya ho ya nahi. Sirf andar jana hi kafi hota hai. Is liye hacker banne ka matlab qanoon torna nahi hai, balkay qanoon ko samajh kar us ke andar reh kar kaam karna hai.

Aik achha ethical hacker qanoon ko apna dost samajhta hai. Woh jaanta hai ke kya jaiz hai aur kya najaiz hai. Agar aap is field mein aage badhna chahte hain, to pehle qanoon aur permission ko yaad rakhen. Isi se aap ki izzat banti hai aur log aap par bharosa karte hain. Sirf apni cheezon par, permission ke saath."""
                ),
                Lesson(
                    id = "m1l5",
                    title = "Ethical Hacker Kya Karta Hai",
                    body = """Ethical hacker ka kaam system ko toorna nahi, usay mazboot banana hai. Woh pehle system ko samajhta hai ke woh kaise kaam karta hai. Phir woh sochta hai ke aik hamla awar kahan se andar aa sakta hai. Us ke baad woh permission se un jagah ko check karta hai aur jo kamzori milti hai, us ki report banata hai. Report mein woh saaf batata hai ke masla kya hai, woh kitna bara hai aur usay kaise theek kiya ja sakta hai.

Is ke ilawa ethical hacker logon ko bhi sikhata hai. Woh staff ko batata hai ke fake email se kaise bachen, mazboot password kaise banayen aur apni maloomat ko kaise mehfooz rakhen. Woh aksar aik team ke saath kaam karta hai aur us ka kaam likhna, samjhana aur madad karna bhi hota hai, sirf computer par kaam karna nahi.

Ethical hacker banne ke liye sirf tools seekhna kafi nahi hota. Achha dimagh, sabar, imandari aur seekhne ki lagan zaroori hai. Aap ko computer, network aur logon ki aadat ko samajhna hota hai. Is course mein hum inhi bunyadi cheezon se shuru kar rahe hain, taake aap aahista aahista aik samajhdar aur zimmedar seekhne wale ban saken. Sirf apni cheezon par, permission ke saath."""
                )
            ),
            quiz = listOf(
                QuizQuestion(
                    question = "Ethical hacker sab se pehle kya karta hai?",
                    options = listOf("Malik se permission leta hai", "Bina bataye password chura leta hai", "Kisi ka account khol leta hai", "Fake email bhej deta hai"),
                    correctIndex = 0,
                    explanation = "Ethical hacker hamesha pehle permission leta hai. Bina permission ke andar jana ethical hacking nahi hota."
                ),
                QuizQuestion(
                    question = "White hat hacker kaun hota hai?",
                    options = listOf("Jo paise ke liye data churaata hai", "Jo bina permission ke system check karta hai", "Jo permission se kamzori dhoondh kar madad karta hai", "Jo fake SMS bhejta hai"),
                    correctIndex = 2,
                    explanation = "White hat hacker permission le kar kaam karta hai aur kamzori bata kar hifazat behtar karta hai."
                ),
                QuizQuestion(
                    question = "Black hat hacker kya karta hai?",
                    options = listOf("Company ko report likh kar deta hai", "Chori aur nuqsan ke liye hack karta hai", "Logon ko password sikhata hai", "Apna network theek karta hai"),
                    correctIndex = 1,
                    explanation = "Black hat hacker chori aur nuqsan ke liye hack karta hai, aur yeh kaam jurm hai."
                ),
                QuizQuestion(
                    question = "Bina permission ke kisi ke system ko dekhna kaisa hai?",
                    options = listOf("Theek hai agar niyat achhi ho", "Theek hai agar kuch churaya na ho", "Theek hai agar kisi ko pata na chale", "Ghalat hai aur qanoon ke khilaf ho sakta hai"),
                    correctIndex = 3,
                    explanation = "Bina permission ke andar jana ghalat hai, chahe niyat achhi ho ya kuch churaya na gaya ho."
                ),
                QuizQuestion(
                    question = "Ethical hacker ki report mein kya hota hai?",
                    options = listOf("Churaya hua password", "Kisi ki niji tasveerein", "Masla kya hai aur us ka hal kya hai", "Fake link banane ka tareeqa"),
                    correctIndex = 2,
                    explanation = "Report mein masla aur us ka hal saaf likha hota hai, taake malik apni hifazat behtar kar sake."
                )
            )
        ),
        Module(
            id = "m2",
            number = 2,
            title = "Networking Ki Bunyaad",
            subtitle = "Internet kaise kaam karta hai, asaan lafzon mein",
            iconKey = "network",
            lessons = listOf(
                Lesson(
                    id = "m2l1",
                    title = "IP Address Kya Hai",
                    body = """IP address har device ka aik khaas pata hota hai, jaise har ghar ka apna pata hota hai. Jab aap ka phone ya computer internet se jurta hai, to usay aik IP address milta hai. Is pate se internet ko pata chalta hai ke maloomat kis device tak pahunchani hai. Bina pate ke koi chitthi theek jagah nahi pahunch sakti, aur bina IP address ke koi data theek device tak nahi pahunch sakta.

IP address aam tor par chaar hison mein likha jata hai, jaise 192.168.1.5. Is mein har hissa aik number hota hai. Aap ka ghar ka network aur aap ka internet wala network alag IP address istemal karte hain. Aap ka router aap ke ghar ke andar devices ko aik tarah ke address deta hai, aur internet par aap ka bahari pata alag hota hai. Yeh sab khud bakhud hota hai, aap ko yaad rakhne ki zaroorat nahi.

Security ke liye IP address ko samajhna zaroori hai, kyun ke is se pata chalta hai ke kaun si device kahan se juri hui hai. Apna IP address kisi ajnabi ko batana achha nahi hota. Aap apne ghar ke network mein sirf apni devices ko jorne den aur apne router ka password mazboot rakhen. Sirf apni cheezon par, permission ke saath."""
                ),
                Lesson(
                    id = "m2l2",
                    title = "Port Kya Hota Hai",
                    body = """Port aik darwaze ki tarah hota hai, jis se aik khaas kisam ki khidmat andar ya bahar jati hai. Har computer mein bohat se port hote hain, lekin har port ka apna number aur apna kaam hota hai. Misaal ke tor par website dekhne ke liye aik port istemal hota hai, email bhejne ke liye doosra, aur file bhejne ke liye teesra. Is tarah computer ko pata chal jata hai ke aane wali maloomat kis kaam ke liye hai.

Aap isay aik bade ghar ki misaal se samajh sakte hain. Ghar mein aik hi pata hai, lekin andar kayi darwaze hain. Aik darwaza mehmaan ke liye hai, aik darwaza saman ke liye hai aur aik darwaza malik ke liye hai. Port bhi aise hi darwaze hain. Har port ka number batata hai ke woh kis khidmat ke liye khula hai. Kuch port aam hotay hain aur kuch khaas kaam ke liye hote hain.

Security mein port ko samajhna is liye zaroori hai ke jo darwaze khule hon, un se andar aane ka rasta mil sakta hai. Is liye sirf wohi port khule hone chahiye jin ki zaroorat ho. Aap apne computer ya router mein bina samjhe koi port na kholen. Sirf apni cheezon par, permission ke saath."""
                ),
                Lesson(
                    id = "m2l3",
                    title = "DNS Kaise Kaam Karta Hai",
                    body = """DNS ka matlab hai Domain Name System. Yeh internet ki phone book ki tarah hai. Jab aap browser mein koi naam likhte hain, jaise kisi website ka naam, to computer ko us ka IP address chahiye hota hai. DNS wohi kaam karta hai: woh naam ko IP address mein badal deta hai, taake aap ki darkhwast theek computer tak pahunch sake. Aap ko number yaad rakhne nahi parte, sirf naam yaad rakhna hota hai.

Yeh kaam bohat tezi se hota hai. Aap naam likhte hain, DNS server naam dhoondhta hai, us ka IP address wapas bhejta hai aur phir aap ka browser us website se jor jata hai. Yeh sab aik pal mein hota hai. Agar DNS theek kaam na kare, to naam likhne ke bawajood website nahi khulti. Is liye DNS internet ka aik bohat aham hissa hai.

Security ke liye bhi DNS ko samajhna zaroori hai. Kabhi kabhi ghalat DNS ya fake website aap ko ghalat jagah bhej sakti hai. Is liye hamesha website ka naam theek se likhen aur agar koi website ajeeb lage, to wahan apna password ya bank ki maloomat na likhen. Apne ghar ke router ki DNS setting bina samjhe na badlen. Sirf apni cheezon par, permission ke saath."""
                ),
                Lesson(
                    id = "m2l4",
                    title = "HTTP Aur HTTPS Mein Farq",
                    body = """HTTP aur HTTPS dono website se maloomat lene aur bhejne ke tareeqe hain. HTTP purana aur saada tareeqa hai, is mein maloomat khule lafzon mein jati hai. Is ka matlab hai ke agar koi beech mein maloomat ko dekh le, to woh usay parh sakta hai. Is liye HTTP par password ya bank ki maloomat bhejna mehfooz nahi hota.

HTTPS is ka mehfooz version hai. Is mein S ka matlab hai Secure, yaani mehfooz. HTTPS mein aap ki maloomat band lifafe ki tarah jati hai, jo rasta mein koi parh nahi sakta. Jab aap browser mein website kholte hain, to address ke paas aik tala ki nishani nazar aati hai, to is ka matlab hai ke woh website HTTPS istemal kar rahi hai. Aaj kal zyada tar achhi websites HTTPS istemal karti hain.

Aap ke liye aik saada qanoon hai: jahan bhi aap ko password, bank card ya niji maloomat likhni ho, wahan pehle tala ki nishani aur HTTPS zaroor check karen. Agar sirf HTTP likha ho ya tala na ho, to wahan apni niji maloomat na likhen. Yeh aik chhoti aadat aap ko bade nuqsan se bacha sakti hai. Sirf apni cheezon par, permission ke saath."""
                ),
                Lesson(
                    id = "m2l5",
                    title = "Apna Network Samajhna",
                    body = """Apna network samajhne ka matlab hai ke aap ko pata ho ke aap ke ghar mein kaun si devices internet se juri hain, aap ka Wi-Fi ka naam kya hai aur us ka password kya hai. Zyada tar gharon mein aik router hota hai jo internet ko ghar ki devices tak pahunchata hai, jaise phone, computer aur TV. Router ki setting mein ja kar aap dekh sakte hain ke kaun si devices juri hui hain.

Aik achhi aadat yeh hai ke waqt waqt se apne router ki list check karen. Agar koi ajnabi device nazar aaye, to usay foran hatayen aur apna Wi-Fi password badal den. Router ka default password, jo company ne diya hota hai, kabhi bhi waisa hi na rakhen. Usay badal kar aik mazboot password rakhen jo sirf aap ko aur aap ke ghar walon ko pata ho.

Apna network mehfooz rakhne ke liye Wi-Fi ka password kisi ajnabi ko na den, aur mehmano ke liye alag guest network banayen agar router mein yeh sahulat ho. Apne router ka software bhi update rakhna achha hota hai. Yeh sab kaam sirf apne ghar ke network par karen. Sirf apni cheezon par, permission ke saath."""
                )
            ),
            quiz = listOf(
                QuizQuestion(
                    question = "IP address kis kaam aata hai?",
                    options = listOf("Password banata hai", "Device ka pata batata hai taake data theek jagah pahunche", "Website ka rang badalta hai", "Phone ki battery bachata hai"),
                    correctIndex = 1,
                    explanation = "IP address har device ka khaas pata hota hai, is se data theek device tak pahunchta hai."
                ),
                QuizQuestion(
                    question = "Port kya hota hai?",
                    options = listOf("Aik kisam ka password", "Aik website ka naam", "Aik computer ka rang", "Aik khaas khidmat ke liye darwaza"),
                    correctIndex = 3,
                    explanation = "Port aik darwaze ki tarah hota hai, har port ki apni khidmat aur apna number hota hai."
                ),
                QuizQuestion(
                    question = "DNS kya karta hai?",
                    options = listOf("Website ke naam ko IP address mein badalta hai", "Password chura leta hai", "Phone ko charge karta hai", "Video download karta hai"),
                    correctIndex = 0,
                    explanation = "DNS naam ko IP address mein badalta hai, taake browser theek website tak pahunch sake."
                ),
                QuizQuestion(
                    question = "Password likhne se pehle kya check karna chahiye?",
                    options = listOf("Website ka rang", "Website ka size", "HTTPS aur tala ki nishani", "Phone ki awaz"),
                    correctIndex = 2,
                    explanation = "Password ya bank ki maloomat likhne se pehle HTTPS aur tala ki nishani zaroor check karen."
                ),
                QuizQuestion(
                    question = "Apne Wi-Fi ko mehfooz rakhne ke liye kya karna chahiye?",
                    options = listOf("Password sab ko bata den", "Router ka default password badal kar mazboot password rakhen", "Router ko hamesha khula chor den", "Ajnabi devices ko jorne den"),
                    correctIndex = 1,
                    explanation = "Router ka default password badalna aur mazboot password rakhna apne network ko mehfooz rakhta hai."
                )
            )
        ),
        Module(
            id = "m3",
            number = 3,
            title = "Linux Aur Terminal",
            subtitle = "Computer se likh kar baat karna seekhen",
            iconKey = "terminal",
            lessons = listOf(
                Lesson(
                    id = "m3l1",
                    title = "Linux Kya Hai",
                    body = """Linux aik computer ka operating system hai, jaise Windows aur macOS hain. Farq yeh hai ke Linux aam tor par muft hota hai aur bohat se log isay mil kar behtar banate hain. Duniya ke zyada tar server, yaani woh bade computer jo websites chalate hain, Linux par chalte hain. Is liye jo log security seekhna chahte hain, un ke liye Linux ko samajhna bohat zaroori hai.

Linux ki khaasiyat yeh hai ke yeh halka, tez aur mehfooz mana jata hai. Is mein aap ko har cheez par zyada control milta hai. Aap dekh sakte hain ke system ke andar kya ho raha hai aur kya badla ja sakta hai. Aap ko is ke liye pehle se mahir hone ki zaroorat nahi hai. Sirf bunyadi baatein seekh kar bhi aap aahista aahista Linux ko samajh sakte hain.

Is course mein hum Linux ko khatarnak tareeqay se istemal nahi karenge. Hum sirf apne computer par, ya aik mehfooz seekhne wale mahol mein, bunyadi commands ko samjhenge. Aap apne phone ya computer ki setting mein bina samjhe kuch na badlen. Seekhna aahista aur mehfooz tareeqay se behtar hota hai. Sirf apni cheezon par, permission ke saath."""
                ),
                Lesson(
                    id = "m3l2",
                    title = "Terminal Kya Hai",
                    body = """Terminal aik aisi jagah hai jahan aap computer ko likh kar hukam dete hain, aur computer aap ko likh kar jawab deta hai. Aam tor par hum mouse se click kar ke kaam karte hain, lekin terminal mein hum lafz likhte hain. Pehle pehle yeh ajeeb lag sakta hai, lekin aahista aahista yeh bohat taqatwar aur tez tareeqa ban jata hai. Aik chhota sa hukam woh kaam kar sakta hai jo kayi click se hota hai.

Terminal ko black screen par safed lafz likhe hue dekha jata hai. Aap wahan aik command likhte hain aur Enter dabate hain, to computer woh kaam kar ke natija dikhata hai. Agar command mein ghalti ho, to computer aap ko bata deta hai ke kuch theek nahi hai. Is se ghabrayen nahi, ghalti seekhne ka hissa hai. Aap dobara theek likh kar koshish kar sakte hain.

Terminal seekhne ke liye sab se achha tareeqa hai chhoti commands se shuru karna aur sirf apne computer par mashq karna. Kisi doosre ke computer par ya kisi server par bina permission ke command na chalaien. Pehle samjhen, phir likhen aur phir natija dekhen. Sirf apni cheezon par, permission ke saath."""
                ),
                Lesson(
                    id = "m3l3",
                    title = "ls, pwd Aur whoami",
                    body = """Terminal ki teen sab se aasan commands ls, pwd aur whoami hain. In ka kaam samajhna bohat aasan hai. ls ka matlab hai list, yaani soochi. Jab aap ls likhte hain, to computer aap ko batata hai ke is jagah par kaun si files aur folders mojood hain. Yeh aap ko apne computer ke andar dekhne ki aankh deta hai.

pwd ka matlab hai print working directory, yaani aap is waqt kis jagah par hain. Computer mein kayi folders hote hain, aur aap har waqt kisi aik folder ke andar hote hain. pwd likhne se computer aap ko woh rasta dikha deta hai jahan aap khade hain. Is se aap kabhi gum nahi hote, kyun ke aap ko hamesha pata rehta hai ke aap kahan hain.

whoami ka matlab hai ke main kaun hoon. Yeh command aap ko batati hai ke is waqt computer par kaun sa user kaam kar raha hai. Yeh chhoti si baat hai, lekin security mein yeh bohat aham hai, kyun ke har user ke apne haq aur apni hadd hoti hai. In teen commands ko sirf apne computer par likh kar dekhen. Sirf apni cheezon par, permission ke saath."""
                ),
                Lesson(
                    id = "m3l4",
                    title = "cd Aur Rasta Badalna",
                    body = """cd ka matlab hai change directory, yaani folder badalna. Computer mein files folders ke andar rakhi hoti hain, jaise ghar mein cheezein alag kamron mein rakhi hoti hain. Agar aap ko kisi doosre folder mein jana hai, to aap cd likh kar us folder ka naam likhte hain. Misaal ke tor par cd Documents likhne se aap Documents folder ke andar chale jate hain.

Aik folder peeche jane ke liye cd likh kar do nuqte istemal kiye jate hain, jaise cd .. likhne se aap aik folder peeche chale jate hain. Apne ghar wale folder mein wapas jane ke liye sirf cd likhna kafi hota hai. Pehle pwd se apni jagah check karen, phir cd se jagah badlen aur phir ls se dekhen ke nayi jagah mein kya hai. Yeh teenon mil kar aap ko computer mein ghoomne ka tareeqa sikhati hain.

Yeh sab mashq sirf apne computer par karen, aur sirf apne folders mein ghoomen. Kisi doosre ke folders mein ya system ke aham folders mein bina samjhe na jayen aur wahan kuch na badlen. Seekhne ka maqsad samajhna hai, kuch toorna nahi. Sirf apni cheezon par, permission ke saath."""
                ),
                Lesson(
                    id = "m3l5",
                    title = "echo Aur cat Se Seekhna",
                    body = """echo aik saada command hai jo aap ke likhe hue lafz wapas dikha deti hai. Misaal ke tor par agar aap echo Salam likhte hain, to computer aap ko Salam dikha de ga. Yeh command seekhne ke liye bohat achhi hai, kyun ke is se aap ko pata chalta hai ke terminal aap ki baat sun raha hai aur jawab de raha hai. Aap is se apna naam, koi jumla ya koi number bhi dikha sakte hain.

cat ka matlab hai file ko parhna. Agar aap ke paas aik chhoti si text file hai, to cat likh kar us file ka naam likhne se computer us file ke andar ka likha hua dikha deta hai. Yeh sirf parhne ka kaam hai, is se file badalti nahi hai. Pehle echo se aik chhoti file banane ka tareeqa seekhna, phir cat se usay parhna, aik mehfooz aur achhi mashq hai.

Is mashq ke liye sirf apni banayi hui file istemal karen, jaise apne naam wali aik chhoti file. Kisi doosre ki file, system ki file ya kisi ki niji maloomat wali file ko cat se na parhen. Sirf wohi file kholen jo aap ki apni ho. Yeh aadat aap ko hamesha mehfooz rakhe gi. Sirf apni cheezon par, permission ke saath."""
                )
            ),
            quiz = listOf(
                QuizQuestion(
                    question = "Linux kya hai?",
                    options = listOf("Aik kisam ka password", "Aik website ka naam", "Aik operating system, jaise Windows", "Aik virus"),
                    correctIndex = 2,
                    explanation = "Linux aik operating system hai, aur duniya ke zyada tar server Linux par chalte hain."
                ),
                QuizQuestion(
                    question = "Terminal mein kaam kaise hota hai?",
                    options = listOf("Likh kar hukam dete hain, computer likh kar jawab deta hai", "Sirf mouse se click karte hain", "Sirf awaz se bolte hain", "Phone ko hila kar kaam karte hain"),
                    correctIndex = 0,
                    explanation = "Terminal mein hum likh kar hukam dete hain aur computer likh kar natija dikhata hai."
                ),
                QuizQuestion(
                    question = "ls command kya karti hai?",
                    options = listOf("Password badalti hai", "Internet band kar deti hai", "Computer ko band kar deti hai", "Mojood files aur folders ki soochi dikhati hai"),
                    correctIndex = 3,
                    explanation = "ls likhne se us jagah ki files aur folders ki soochi nazar aati hai."
                ),
                QuizQuestion(
                    question = "pwd command kis kaam aati hai?",
                    options = listOf("Password banati hai", "Batati hai ke aap is waqt kis folder mein hain", "Wi-Fi kholti hai", "File delete karti hai"),
                    correctIndex = 1,
                    explanation = "pwd aap ki mojooda jagah ka rasta dikhati hai, taake aap gum na hon."
                ),
                QuizQuestion(
                    question = "cat command kya karti hai?",
                    options = listOf("Aik text file ke andar ka likha hua dikhati hai", "File ko hamesha ke liye delete karti hai", "Password chura leti hai", "Computer ko hack karti hai"),
                    correctIndex = 0,
                    explanation = "cat sirf file ko parh kar dikhati hai, is se file badalti nahi hai."
                )
            )
        ),
        Module(
            id = "m4",
            number = 4,
            title = "Password Security",
            subtitle = "Apne accounts ko mazboot taala lagana seekhen",
            iconKey = "key",
            lessons = listOf(
                Lesson(
                    id = "m4l1",
                    title = "Mazboot Password Kaisa Hota Hai",
                    body = """Mazboot password woh hota hai jo lamba ho, ajeeb ho aur kisi ke liye andaza lagana mushkil ho. Aik achha password kam se kam barah harf ka hona chahiye. Is mein bare aur chhote harf, number aur khaas nishani, jaise hash ya sawaliya nishan, milay hon to behtar hota hai. Apna naam, apni tareekh-e-pedaish, apne bachon ka naam ya apna phone number kabhi password na banayen, kyun ke yeh maloomat koi bhi andaza laga sakta hai.

Aik asaan tareeqa hai ke aap teen ya chaar ajeeb lafz jor kar aik jumla bana len, jaise hara rang, tez ghora aur thanda pani. Aise jumlay yaad rakhna aasan hota hai, lekin kisi ke liye andaza lagana bohat mushkil hota hai. Is mein beech mein number ya nishani bhi mila sakte hain. Aham baat yeh hai ke password aap ke liye yaad rakhna aasan ho, aur doosre ke liye todna mushkil ho.

Password ko kagaz par likh kar khula na chorain aur kisi ko bhi apna password na batayen, chahe woh aap ka dost ho ya koi jo khud ko company ka aadmi bataye. Asli company kabhi aap se password nahi mangti. Sirf apni cheezon par, permission ke saath."""
                ),
                Lesson(
                    id = "m4l2",
                    title = "Password Reuse Ka Khatra",
                    body = """Password reuse ka matlab hai ke aik hi password har jagah istemal karna. Yeh bohat bara khatra hai. Agar aap ka aik hi password email, Facebook, bank aur har jagah aik jaisa hai, to aik jagah se password chura jane par chor aap ke tamam accounts khol sakta hai. Yeh aisa hai jaise aap ne ghar, dukaan aur almari ka aik hi tala laga diya ho, aur aik chabi milne se sab kuch khul jaye.

Aksar log is liye aik hi password rakhte hain ke alag alag password yaad rakhna mushkil lagta hai. Lekin yeh aasan rasta mehfooz nahi hai. Har aham account ka password alag hona chahiye, khaas tor par email aur bank ka password. Email sab se aham hai, kyun ke is se aksar doosre accounts ka password badla ja sakta hai. Is liye email ka password sab se mazboot aur sab se alag hona chahiye.

Agar aap ko lagta hai ke aap ne aik hi password kayi jagah istemal kiya hai, to aaj se hi aham accounts ka password badalna shuru karen. Pehle email, phir bank, phir baqi aham accounts. Yeh kaam sirf apne accounts par karen. Sirf apni cheezon par, permission ke saath."""
                ),
                Lesson(
                    id = "m4l3",
                    title = "Two-Factor Authentication (2FA)",
                    body = """Two-Factor Authentication, jise 2FA bhi kehte hain, aik doosri tala hai jo aap ke account ko aur mazboot bana deti hai. Is mein sirf password kafi nahi hota. Password ke baad aap se aik aur cheez mangi jati hai, jaise aap ke phone par aane wala code, ya aik app se milne wala number. Is ka matlab hai ke agar koi aap ka password chura bhi le, to woh aap ke phone ke bina account nahi khol sakta.

Aap isay aik ghar ki misaal se samajh sakte hain. Sirf password aik tala hai, aur 2FA doosra tala hai. Chor ko andar aane ke liye dono talay kholne honge. Is liye 2FA lagana bohat aham hai, khaas tor par email, bank aur social media ke accounts par. Aksar apps mein yeh setting muft milti hai aur isay lagane mein sirf chand minute lagte hain.

2FA lagane ke liye apne account ki security setting mein jayen aur Two-Factor Authentication ko on karen. Code aap ke phone par aaye ga, usay kisi ko na batayen. Apne backup code ko bhi mehfooz jagah par rakhen. Yeh kaam sirf apne accounts par karen. Sirf apni cheezon par, permission ke saath."""
                ),
                Lesson(
                    id = "m4l4",
                    title = "Password Manager Kya Hai",
                    body = """Password manager aik mehfooz app ya program hota hai jo aap ke tamam password ko aik jagah par, band kar ke rakhta hai. Aap ko sirf aik mazboot master password yaad rakhna hota hai, baqi password password manager yaad rakhta hai. Jab aap ko kisi website par jana ho, to password manager khud aap ka password bhar deta hai. Is se aap har account ke liye alag aur lamba password rakh sakte hain, bina yaad rakhne ki pareshani ke.

Password manager ka faida yeh hai ke aap ko aik hi password dobara istemal nahi karna parta. Woh aap ke liye mazboot password bana bhi sakta hai, jo andaza lagana bohat mushkil hota hai. Aap ke password aik khaas tareeqay se band hote hain, taake koi aasani se unhen parh na sake. Lekin yaad rakhen, master password bohat mazboot hona chahiye, kyun ke yeh tamam password ki chabi hai.

Password manager chunne mein ehtiyat karen. Sirf mashhoor aur bharose wali app istemal karen aur usay sirf apne phone ya computer par lagayen. Apna master password kisi ko na batayen aur usay kisi ajnabi jagah par na likhen. Sirf apni cheezon par, permission ke saath."""
                ),
                Lesson(
                    id = "m4l5",
                    title = "Password Badalna Aur Bachana",
                    body = """Password badalna aik achhi aadat hai, khaas tor par jab aap ko shak ho ke kisi ne aap ka password dekh liya hai, ya kisi website se data chori hone ki khabar aayi ho. Aise mein foran us account ka password badlen, aur agar wohi password kisi aur jagah bhi istemal kiya ho, to wahan ka bhi badlen. Pehle aham accounts ko tarjeeh den, jaise email aur bank.

Password bachane ka matlab hai ke aap apna password kisi se share na karen, kisi fake website par na likhen aur kisi ajnabi ke computer par apna account khol kar bhool na jayen. Agar aap ko kisi doosre ke computer par kaam karna pare, to kaam ke baad logout zaroor karen aur password save karne ka sawal aaye to no ya kabhi nahi dabayen. Apne phone mein screen lock bhi lagayen, taake koi aap ka phone utha kar aap ke accounts na khol sake.

Aik aur achhi aadat yeh hai ke waqt waqt se apne accounts ki security setting check karen. Dekhen ke kaun si devices aap ke account se juri hain, aur ajnabi device nazar aaye to usay hata den. Yeh sab kaam sirf apne accounts par karen. Sirf apni cheezon par, permission ke saath."""
                )
            ),
            quiz = listOf(
                QuizQuestion(
                    question = "Mazboot password kaisa hota hai?",
                    options = listOf("Apna naam aur tareekh-e-pedaish", "Chhota aur yaad rakhna aasan", "Har jagah aik jaisa", "Lamba, ajeeb aur andaza lagana mushkil"),
                    correctIndex = 3,
                    explanation = "Mazboot password lamba aur ajeeb hota hai, is mein harf, number aur nishani milay hote hain."
                ),
                QuizQuestion(
                    question = "Aik hi password har jagah rakhna kyun khatarnak hai?",
                    options = listOf("Password yaad rakhna aasan ho jata hai", "Aik jagah se chura jane par tamam accounts khul jate hain", "Phone tez chalta hai", "Internet sasta ho jata hai"),
                    correctIndex = 1,
                    explanation = "Aik password chura jane par chor aap ke tamam accounts khol sakta hai, is liye har account ka password alag rakhen."
                ),
                QuizQuestion(
                    question = "2FA ka kya faida hai?",
                    options = listOf("Password ko chhota kar deta hai", "Phone ki battery bachata hai", "Password ke baad doosra code mangta hai, account aur mehfooz ho jata hai", "Internet tez kar deta hai"),
                    correctIndex = 2,
                    explanation = "2FA mein password ke baad phone par code bhi chahiye hota hai, is se chor sirf password se andar nahi aa sakta."
                ),
                QuizQuestion(
                    question = "Password manager kya karta hai?",
                    options = listOf("Tamam password mehfooz tareeqay se yaad rakhta hai", "Password sab ko bata deta hai", "Password ko internet par dal deta hai", "Password ko delete kar deta hai"),
                    correctIndex = 0,
                    explanation = "Password manager aap ke password mehfooz rakhta hai, aap ko sirf aik master password yaad rakhna hota hai."
                ),
                QuizQuestion(
                    question = "Password kab badalna chahiye?",
                    options = listOf("Kabhi nahi", "Sirf jab phone naya ho", "Sirf jab koi kahe ke password bata do", "Jab shak ho ke password kisi ne dekh liya hai ya data chori hua hai"),
                    correctIndex = 3,
                    explanation = "Shak hone par ya data chori ki khabar par foran password badal den, pehle aham accounts ka."
                )
            )
        ),
        Module(
            id = "m5",
            number = 5,
            title = "Phishing Pehchan-na",
            subtitle = "Fake emails aur links se khud ko bachana",
            iconKey = "email",
            lessons = listOf(
                Lesson(
                    id = "m5l1",
                    title = "Phishing Kya Hai",
                    body = """Phishing aik dhoka hai jis mein koi aadmi apne aap ko kisi bharose wali company, bank ya dost ke roop mein pesh kar ke aap se aap ka password, bank ki maloomat ya paisa lene ki koshish karta hai. Yeh dhoka aksar email, SMS ya message se aata hai. Us mein likha hota hai ke aap ka account band ho jayega, aap ko inaam mila hai ya aap ko foran kuch karna hai. Log ghabra kar ya lalach mein aa kar link par click kar dete hain.

Phishing ka maqsad aap ki maloomat churana hota hai. Fake website asal website jaisi lagti hai, lekin woh chor ki banayi hui hoti hai. Jab aap wahan apna password likhte hain, to woh chor ke paas chala jata hai. Phir woh aap ke account se paisa nikal sakta hai ya aap ke naam par ghalat kaam kar sakta hai. Is liye phishing ko pehchan-na aaj ke waqt mein bohat zaroori hai.

Achhi khabar yeh hai ke phishing ki nishaniyan aam tor par nazar aa jati hain, agar aap thoda sa ruk kar gaur karen. Jaldi mein click na karen, pehle sochen aur shak ho to kisi bharose wale se pooch len. Is module mein hum wohi nishaniyan seekhenge. Sirf apni cheezon par, permission ke saath."""
                ),
                Lesson(
                    id = "m5l2",
                    title = "Fake Email Ki Nishaniyan",
                    body = """Fake email ko pehchan-ne ke liye pehle bhejne wale ka pata dekhen. Asli company ka email usi ke naam se aata hai, lekin fake email mein naam theek lagta hai aur pata ajeeb hota hai, jaise naam mein aik harf badla hua ho ya peeche koi ajeeb lafz jora hua ho. Agar pata ajeeb lage, to us email par bharosa na karen. Email ke andar ghalat urdu ya angrezi, ajeeb jumlay aur jaldi karne ka dabao bhi fake hone ki nishani hain.

Doosri nishani yeh hai ke email mein aap ko dhamki di jati hai ke aap ka account band ho jayega, ya lalach di jati hai ke aap ko bara inaam mila hai. Asli bank ya company aap se email mein kabhi password, card ka number ya aik martaba wala code nahi mangti. Agar email mein aisa kuch manga jaye, to woh fake hai. Email mein di gayi file ko bhi bina soche na kholen, kyun ke us mein virus ho sakta hai.

Agar aap ko aisa email mile, to us ka jawab na den aur us mein di gayi link par click na karen. Company se rabta karna ho to us ki asal website ya asal number khud dhoondh kar rabta karen. Email ko delete kar den ya spam ki shikayat kar den. Sirf apni cheezon par, permission ke saath."""
                ),
                Lesson(
                    id = "m5l3",
                    title = "Fake Link Kaise Pehchanen",
                    body = """Fake link aik aisa rasta hai jo aap ko asal website ki bajaye chor ki banayi hui website par le jata hai. Yeh link dekhne mein asal jaisa lagta hai, lekin is mein chhoti si tabdeeli hoti hai. Misaal ke tor par naam mein aik harf badla hua ho, ya naam ke aakhir mein koi ajeeb lafz jora hua ho. Aap ko lage ga ke aap theek jagah ja rahe hain, lekin aap ghalat jagah pahunch jayenge. Is liye link par click karne se pehle usay gaur se parhen.

Link ko check karne ka aik asaan tareeqa hai ke aap link ko dabayen nahi, sirf us par ungli rakhen ya mouse le jayen, to neeche asal pata nazar aa jata hai. Agar woh pata wohi na ho jo aap ko chahiye, to click na karen. Chhote kiye hue link, jahan pata chhupa hua ho, un par bhi ehtiyat karen. Agar kisi message mein sirf link ho aur koi saaf baat na ho, to usay na kholen.

Hamesha aham website, jaise bank ya email, ka pata khud likh kar kholen, kisi message ki link se na kholen. Agar link par click karne ke baad website ajeeb lage ya password dobara mange, to foran wapas aa jayen. Sirf apni cheezon par, permission ke saath."""
                ),
                Lesson(
                    id = "m5l4",
                    title = "Fake SMS Aur Call Se Bachao",
                    body = """Fake SMS aur call bhi phishing ka aik tareeqa hai. SMS mein likha hota hai ke aap ka bank account band ho raha hai, aap ka parcel ruka hua hai, ya aap ko paisa mila hai. Us ke saath aik link bhi hoti hai ya aik number hota hai jis par rabta karne ko kaha jata hai. Aise SMS par foran yakeen na karen. Asli bank aap ko SMS mein kabhi password ya card ka number nahi mangta.

Fake call mein koi khud ko bank ka aadmi, police wala ya company ka banda bata kar aap se code ya password mangta hai. Yaad rakhen, koi asli company kabhi phone par aap se aik martaba wala code, password ya card ka poora number nahi mangti. Agar koi aisa mange, to foran phone band kar den. Us number par wapas call bhi na karen, balkay company ka asal number khud dhoondh kar rabta karen.

Ajnabi number se aane wali call par apni niji maloomat kabhi na batayen. Agar aap ko koi kahe ke aap ne inaam jeeta hai aur pehle paisa bhejen, to woh yaqeenan dhoka hai. Shak ho to apne ghar ke kisi bare se pooch len. Sirf apni cheezon par, permission ke saath."""
                ),
                Lesson(
                    id = "m5l5",
                    title = "Shak Ho To Kya Karen",
                    body = """Agar aap ko kisi email, SMS, link ya call par shak ho, to sab se pehle ruk jayen aur jaldi mein kuch na karen. Kisi bhi link par click na karen, koi file na kholen aur apna password ya code kisi ko na batayen. Shak hona hi kafi wajah hai ke aap ruk kar sochen. Aap ka rukna aap ko bade nuqsan se bacha sakta hai. Jaldi mein kiya gaya aik click bhi nuqsan pahuncha sakta hai.

Doosra qadam yeh hai ke khud asal jagah se rabta karen. Misaal ke tor par agar SMS bank ke naam se aaya hai, to bank ki asal website khud kholen ya bank ka asal number dhoondh kar call karen. Message mein di gayi link ya number ko istemal na karen. Agar aap ne ghalti se password likh diya ho, to foran apna password badlen aur apne bank ko khabar karen. Apne ghar walon ko bhi bata den, taake woh bhi hoshiyar rahen.

Teesra qadam yeh hai ke fake message ki shikayat karen. Email ko spam batayen, SMS ko block karen aur number ko report karen. Apne phone aur computer ka software bhi update rakhen. Yaad rakhen, shak hone par poochna sharm ki baat nahi hai, balkay aqalmandi hai. Sirf apni cheezon par, permission ke saath."""
                )
            ),
            quiz = listOf(
                QuizQuestion(
                    question = "Phishing kya hai?",
                    options = listOf("Aik kisam ka computer", "Dhoka de kar password ya maloomat churane ki koshish", "Aik mazboot password", "Aik email app"),
                    correctIndex = 1,
                    explanation = "Phishing mein chor khud ko bharose wali company bata kar aap se password ya maloomat lene ki koshish karta hai."
                ),
                QuizQuestion(
                    question = "Fake email ki aik nishani kya hai?",
                    options = listOf("Bhejne wale ka pata ajeeb ho aur jaldi karne ka dabao ho", "Email mein aap ka naam theek likha ho", "Email mein koi link na ho", "Email din mein aaye"),
                    correctIndex = 0,
                    explanation = "Fake email mein pata ajeeb hota hai aur jaldi karne ka dabao hota hai, taake aap bina soche click kar den."
                ),
                QuizQuestion(
                    question = "Fake link se bachne ke liye kya karna chahiye?",
                    options = listOf("Har link par foran click kar den", "Link ko sab ko bhej den", "Link par apna password likh den", "Link par click karne se pehle asal pata gaur se parhen"),
                    correctIndex = 3,
                    explanation = "Link par click karne se pehle us ka asal pata check karen, aur aham website ka pata khud likh kar kholen."
                ),
                QuizQuestion(
                    question = "Agar koi call par aap se aik martaba wala code mange, to kya karen?",
                    options = listOf("Code foran bata den", "Code message mein bhej den", "Foran phone band kar den aur code kisi ko na batayen", "Code kagaz par likh kar de den"),
                    correctIndex = 2,
                    explanation = "Asli company kabhi phone par code nahi mangti, is liye foran phone band kar den."
                ),
                QuizQuestion(
                    question = "Shak ho to sab se pehle kya karna chahiye?",
                    options = listOf("Foran link par click kar den", "Ruk jayen, click na karen aur password kisi ko na batayen", "Apna password sab ko bata den", "Fake file khol kar dekh len"),
                    correctIndex = 1,
                    explanation = "Shak ho to ruk jayen aur kuch na karen, phir asal jagah se khud rabta kar ke tasdeeq karen."
                )
            )
        )
    )

    val dailyTips: List<String> = listOf(
        "Apna password kisi ko na batayen, chahe woh khud ko company ka aadmi bataye.",
        "Har account ke liye alag password rakhen, khaas tor par email ke liye.",
        "Email aur bank par two-factor authentication zaroor on karen.",
        "Kisi bhi link par click karne se pehle us ka asal pata gaur se parhen.",
        "Bank kabhi email ya call par password ya code nahi mangta.",
        "Apne phone par screen lock lagayen aur use hamesha on rakhen.",
        "Ajnabi Wi-Fi par bank ya email ka account na kholen.",
        "Apne phone aur computer ka software hamesha update rakhen.",
        "Fake inaam wale message par yakeen na karen, inaam ke liye paisa kabhi na bhejen.",
        "Apna Wi-Fi password sirf ghar walon ko batayen, ajnabi ko nahi.",
        "Router ka default password badal kar mazboot password rakhen.",
        "Kisi ajnabi ki bheji hui file ko bina soche na kholen.",
        "Password mein apna naam ya tareekh-e-pedaish kabhi na likhen.",
        "Apne accounts mein kaun si devices juri hain, waqt waqt se check karen.",
        "Kisi doosre ke computer par kaam ke baad logout karna na bhoolen.",
        "Shak ho to ruk jayen, jaldi mein click na karen.",
        "Apni niji tasveerein aur maloomat ajnabi ko na bhejen.",
        "Website par password likhne se pehle HTTPS aur tala ki nishani check karen.",
        "Apne bachon ko bhi fake message se bachna sikhayen.",
        "Aik hi password har jagah istemal na karen.",
        "Apne email ka password sab se mazboot aur sab se alag rakhen.",
        "Ajnabi call par apna card number ya code kabhi na batayen.",
        "Apne phone mein sirf bharose wali apps install karen.",
        "Apna backup code mehfooz jagah par rakhen, kisi ko na batayen.",
        "Kisi website ka naam theek se likhen, aik harf ki ghalti bhi fake site par le ja sakti hai.",
        "Apne ghar walon ko phishing ke bare mein batayen, taake woh bhi mehfooz rahen.",
        "Apna password kagaz par likh kar khula na chorain.",
        "Free Wi-Fi par apni bank ki maloomat kabhi na likhen.",
        "Agar password chori hone ka shak ho, to foran password badal den.",
        "Seekhne ke liye sirf apni cheezein istemal karen, permission ke saath."
    )
}
