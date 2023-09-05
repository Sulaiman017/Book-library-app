package com.example.books;

import java.util.ArrayList;

public class Util {
    private static ArrayList<Books> seeall;
    private static ArrayList<Books> currentlyreading;
    private static ArrayList<Books> wanttoreadbooks;
    private static ArrayList<Books> alreadyread;
    private static int id;

    public Util(){
        if(seeall == null){
            seeall = new ArrayList<>();
        }
        if (currentlyreading == null){
            currentlyreading = new ArrayList<>();
        }
        if (wanttoreadbooks == null){
            wanttoreadbooks = new ArrayList<>();
        }
        if (alreadyread == null){
            alreadyread = new ArrayList<>();
        }
    }

    public static ArrayList<Books> getSeeall() {

        return seeall;
    }

    public static ArrayList<Books> getCurrentlyreading() {

        return currentlyreading;
    }

    public static ArrayList<Books> getWanttoreadbooks() {

        return wanttoreadbooks;
    }

    public static ArrayList<Books> getAlreadyread() {

        return alreadyread;
    }

    public static boolean addCurrently(Books books){

        return currentlyreading.add(books);
    }

    public static boolean addWant(Books books){

        return wanttoreadbooks.add(books);
    }

    public static boolean addAlready(Books books){

        return alreadyread.add(books);
    }
    public static boolean removeCurrently(Books books){

        return currentlyreading.remove(books);
    }

    public static boolean removeWant(Books books){

        return wanttoreadbooks.remove(books);
    }

    public static boolean removeAlready(Books books){

        return alreadyread.remove(books);
    }

    public void initbooks(){
        String name="";
        String author ="";
        String description = "";
        int pages = 0;
        String imageurl = "";

        id++;
        name = "The Gatekeeper's Descendants";
        author = "Johanna Frank ";
        description = "Every choice he makes complicates his life. When a teen has a chance at redemption, can he find his way back or remain forever cursed?\n" +
                "\n" +
                "1973. Thirteen-year-old Matthew Mackenzie struggles to fit in. Unable to come to terms with his father’s passing five years prior, he tries to sidestep unwanted attention from violent bullies by telling little white lies. But when a fistfight lands him on the brink of death, he’s shocked when he finds himself hovering outside his beaten body in the company of an overly friendly spirit.\n" +
                "\n" +
                "Pipiera avoids change at all costs. As assistant to the head gatekeeper of an ethereal kingdom, she’s less than thrilled when she’s sent to Earth to aid a traumatized boy headed down a dark road. But when a supernatural rebel interferes with her job, the bright-eyed being fears she’ll blunder her mission.\n" +
                "\n" +
                "As Matthew feels the pull of adventure from his suspicious new friend, he worries that he may never be able to right all of his wrongs. And as Pipiera continues to fail to influence Matthew, she finds herself caught in an adversary’s web of deceit.\n" +
                "\n" +
                "Can Matthew and Pipiera steer clear of the trap and reach the path of enlightenment?\n" +
                "\n" +
                "The Gatekeeper’s Descendants is a dramatic coming-of-age fantasy tale. If you like thought-provoking stories, the power of good against evil, and deep family connections, then you’ll adore Johanna Frank’s allegorical read.\n" +
                "\n" +
                "Buy The Gatekeeper’s Descendants to step toward the light today!";
        pages = 400;
        imageurl = "https://i.gr-assets.com/images/S/compressed.photo.goodreads.com/books/1632419931l/59062225._SY475_.jpg";
        seeall.add(new Books(name,author,imageurl,description,pages,id));

        id++;
        name = "The Righteous";
        author = "Renée Ahdieh ";
        description = "Pippa Montrose is tired of losing everything she loves. When her best friend Celine disappears under mysterious circumstances, Pippa resolves to find her, even if the journey takes her into the dangerous world of the fae, where she might find more than she bargained for in the charismatic Arjun Desai.\n" +
                "\n" +
                "Renée is back with her rich, atmospheric fantasy world that will continue to enthrall readers, new romance and mystery, and lush, pacey writing. ";
        pages = 100;
        imageurl = "https://i.gr-assets.com/images/S/compressed.photo.goodreads.com/books/1617384608l/56876830._SY475_.jpg";
        seeall.add(new Books(name,author,imageurl,description,pages,id));

        id++;
        name = "The Midnight Girls";
        author = "Alicia Jasinska ";
        description = "The Wicked Deep meets House of Salt and Sorrows in this new standalone YA fantasy set in a snow-cloaked kingdom where witches are burned, and two enchantresses secretly compete for the heart of a prince, only to discover that they might be falling for each other.\n" +
                "\n" +
                "It's Karnawał season in the snow-cloaked Kingdom of Lechija, and from now until midnight when the church bells ring an end to Devil's Tuesday time will be marked with wintry balls and glittery disguises, cavalcades of nightly torch-lit \"kuligi\" sleigh-parties.\n" +
                "\n" +
                "Unbeknownst to the oblivious merrymakers, two monsters join the fun, descending upon the royal city of Warszów in the guise of two innocent girls. Newfound friends and polar opposites, Zosia and Marynka seem destined to have a friendship that's stronger even than magic. But that's put to the test when they realize they both have their sights set on Lechija's pure-hearted prince. A pure heart contains immeasurable power and Marynka plans to bring the prince's back to her grandmother in order to prove herself. While Zosia is determined to take his heart and its power for her own.\n" +
                "\n" +
                "When neither will sacrifice their ambitions for the other, the festivities spiral into a wild contest with both girls vying to keep the hapless prince out of the other's wicked grasp. But this isn't some remote forest village, where a hint of stray magic might go unnoticed, Warszów is the icy capital of a kingdom that enjoys watching monsters burn, and if Zosia and Marynka's innocent disguises continue to slip, their escalating rivalry might cost them not just the love they might have for each other, but both their lives.!";
        pages = 500;
        imageurl = "https://i.gr-assets.com/images/S/compressed.photo.goodreads.com/books/1616956637l/52238544.jpg";
        seeall.add(new Books(name,author,imageurl,description,pages,id));

        id++;
        name = "The Veiled Throne";
        author = "Ken Liu ";
        description = "With the invasion of Dara complete, and the Wall of Storms breached, the world has opened to new possibilities for the gods and peoples of both empires as the sweeping saga of the award-winning Dandelion Dynasty continues in this third book of the “magnificent fantasy epic” (NPR).\n" +
                "\n" +
                "Princess Théra, once known as Empress Üna of Dara, entrusted the throne to her younger brother in order to journey to Ukyu-Gondé to war with the Lyucu. She has crossed the fabled Wall of Storms with a fleet of advanced warships and ten thousand people. Beset by adversity, Théra and her most trusted companions attempt to overcome every challenge by doing the most interesting thing. But is not letting the past dictate the present always possible or even desirable?\n" +
                "\n" +
                "In Dara, the Lyucu leadership as well as the surviving Dandelion Court bristle with rivalries as currents of power surge and ebb and perspectives spin and shift. Here, parents and children, teachers and students, Empress and Pékyu, all nurture the seeds of plans that will take years to bloom. Will tradition yield to new justifications for power?\n" +
                "\n" +
                "Everywhere, the spirit of innovation dances like dandelion seeds on the wind, and the commoners, the forgotten, the ignored begin to engineer new solutions for a new age.\n" +
                "\n" +
                "Ken Liu returns to the series that draws from a tradition of the great epics of our history from the Aeneid to the Romance on the Three Kingdoms and builds a new tale unsurpassed in its scope and ambition.";
        pages = 350;
        imageurl = "https://i.gr-assets.com/images/S/compressed.photo.goodreads.com/books/1617258542l/18952403.jpg";
        seeall.add(new Books(name,author,imageurl,description,pages,id));

        id++;
        name = "Innate Magic";
        author = "Shannon Fay ";
        description = "From debut author Shannon Fay comes the first novel in the enchanting Marrowbone Spells series featuring Paul Gallagher, a lower-class magician who aspires to high society through spells, wits, and irresistible charm.\n" +
                "\n" +
                "Delightfully cheeky, unquestionably charming, and sometimes maddeningly naive, cloth mage Paul Gallagher is desperately trying to make a name for himself in a reimagined postwar London. But in a world where magic is commonplace, sewing enchanted clothes is seen as little more than a frivolous distraction. Paul is hiding a secret, however: he possesses a powerful--and illegal--innate magic that could help him achieve his wildest dreams.\n" +
                "\n" +
                "Unfortunately, Paul confides in the wrong person--his latest crush, Captain Hector Hollister--and is drawn into a sinister plot that risks reigniting the machinery of war. To make matters worse, the pretty American gossip reporter Paul just met reveals her personal quest to expose a government cover-up may be related to Hollister's magical goals. When Hollister threatens the life of Paul's dearest friend, he realizes that his poor judgement has put not only his family and friends in danger, but also the whole world.\n" +
                "\n" +
                "The only way to set things right may be for Paul to undergo the dangerous ritual to become Court Magician--the most powerful magician in the country. But is becoming part of the institution the best way to enact change in a terribly unjust society?";
        pages = 450;
        imageurl = "https://i.gr-assets.com/images/S/compressed.photo.goodreads.com/books/1620686655l/57198295.jpg";
        seeall.add(new Books(name,author,imageurl,description,pages,id));


        id++;
        name = "Starlight";
        author = "Olivia Wildenstein ";
        description = "ANGELIC FACT NUMBER 100: Having wings doesn’t make one noble; it simply makes one fly.\n" +
                "\n" +
                "Naya and Adam have nothing in common. Besides black wings. The same birthday. And fathers who are as close as brothers.\n" +
                "\n" +
                "But nothing else.\n" +
                "\n" +
                "Sweet, diligent Naya has always abided by the rules. Arrogant, uncivil Adam has made it his life’s mission to break each one.\n" +
                "\n" +
                "She is the beloved daughter of an archangel. He is the guilds’ resident bad boy . . . well, bad fletching.\n" +
                "\n" +
                "When Naya thrusts herself in Adam’s life to request a place on his clandestine team of guardians, he turns her away. The last thing his unsanctioned squad needs is an archangel’s attention, and the last thing he needs is a bubbly, blonde distraction with a sinful voice and soulful eyes.\n" +
                "\n" +
                "Problem is, Naya suddenly, and inexplicably, becomes the only thing he wants.\n" +
                "\n" +
                "Fans of steamy supernatural romance will want to scroll up and one-click to start reading the enemies-to-lovers trilogy finale today";
        pages = 600;
        imageurl = "https://i.gr-assets.com/images/S/compressed.photo.goodreads.com/books/1634901697l/59430335._SY475_.jpg";
        seeall.add(new Books(name,author,imageurl,description,pages,id));

        id++;
        name = "The Unraveling of Luna Forester";
        author = "Marisa Noelle ";
        description = "MATTHEW HAS ALWAYS PROTECTED LUNA’S SECRET.\n" +
                "\n" +
                "NOW HE MUST PROTECT HER LIFE.\n" +
                "When his best friend Luna is found catatonic after a devastating house fire, Matthew begins to fall apart.\n" +
                "\n" +
                "“Take care of them, Matthew.”\n" +
                "\n" +
                "“Always.”\n" +
                "\n" +
                "“Protect my secret.”\n" +
                "\n" +
                "“Of course.”\n" +
                "That’s the promise he made to her only three nights ago. A solemn vow to protect their large found family of humans and supernatural creatures alike.\n" +
                "\n" +
                "Fated to love her for the rest of his life, and unwilling to break his solemn vow, Matthew knows the only person who can help Luna is her grandmother. Through the woods they must go, just like a fairytale. But the forest is filled with deadly peril: poisonous black moss, chimeras, and worst of all, members of their family who don't want them to continue.\n" +
                "\n" +
                "As they are picked off one by one, Matthew races to get Luna to safety, all the time doubting everything he thought was true.\n" +
                "\n" +
                "Can Matthew untangle the twisted threads of Luna’s secret before he himself unravels?\n" +
                "\n" +
                "\n" +
                "A dark fantasy horror with Little Red Ridinghood undertones, perfect for fans of Last House on Needle Street (Catriona Ward), Split (J.B. Salsbury), Legion (Brandon Sanderson), Pretty Girl 13 (Liz Coley), The Quiet at the End of the World (Lauren James), Primal Fear (William Diehl), & Tell me your Dreams (Sydney Sheldon).";
        pages = 450;
        imageurl = "https://i.gr-assets.com/images/S/compressed.photo.goodreads.com/books/1636120803l/59538578.jpg";
        seeall.add(new Books(name,author,imageurl,description,pages,id));

        id++;
        name = "The Untold Story";
        author = "Genevieve Cogman ";
        description = "In this thrilling historical fantasy, time-traveling Librarian spy Irene will need to delve deep into a tangled web of loyalty and power to keep her friends safe.\n" +
                "\n" +
                "Irene is trying to learn the truth about Alberich-and the possibility that he's her father. But when the Library orders her to kill him, and then Alberich himself offers to sign a truce, she has to discover why he originally betrayed the Library.\n" +
                "\n" +
                "With her allies endangered and her strongest loyalties under threat, she'll have to trace his past across multiple worlds and into the depths of mythology and folklore, to find the truth at the heart of the Library, and why the Library was first created.";
        pages = 400;
        imageurl = "https://i.gr-assets.com/images/S/compressed.photo.goodreads.com/books/1631274967l/57593991.jpg";
        seeall.add(new Books(name,author,imageurl,description,pages,id));

        id++;
        name = "The Liar’s Knot";
        author = "M.A. Carrick ";
        description = "Trust is the thread that binds us . . . and the rope that hangs us.\n" +
                "\n" +
                "In Nadezra, peace is as tenuous as a single thread. The ruthless House Indestor has been destroyed, but darkness still weaves through the city’s filthy back alleys and jewel-bright gardens, seen by those who know where to look.\n" +
                "\n" +
                "Derossi Vargo has always known. He has sacrificed more than anyone imagines to carve himself a position of power among the nobility, hiding a will of steel behind a velvet smile. He'll be damned if he lets anyone threaten what he's built.\n" +
                "\n" +
                "Grey Serrado knows all too well. Bent under the yoke of too many burdens, he fights to protect the city’s most vulnerable. Sooner or later, that fight will demand more than he can give.\n" +
                "\n" +
                "And Ren, daughter of no clan, knows best of all. Caught in a knot of lies, torn between her heritage and her aristocratic masquerade, she relies on her gift for reading pattern to survive. And it shows her the web of corruption that traps her city.\n" +
                "\n" +
                "But all three have yet to discover just how far that web stretches. And in the end, it will take more than knives to cut themselves free...";
        pages = 1000;
        imageurl = "https://i.gr-assets.com/images/S/compressed.photo.goodreads.com/books/1638803261l/57308929._SY475_.jpg";
        seeall.add(new Books(name,author,imageurl,description,pages,id));

        id++;
        name = "The Shattered Crown";
        author = "Maxym M. Martineauk ";
        description = "Serpent & Dove meets A Curse So Dark and Lonely in this vividly arresting addition to the The Beast Charmer series!\n" +
                "\n" +
                "Leena Edenfrell never dreamed of igniting a war, and her pair bond, Noc Feyreigner, never wanted to set foot on a battlefield again. But when their enemies combine forces, they have no choice but to fight. While Noc makes moves to reclaim his throne, Leena acts as the new Crown of the Charmer's Council, searching for a way to stop the enemy from raising an ancient dragon destined to burn their world to ash.\n" +
                "\n" +
                "But no matter how hard Noc and Leena fight, the odds are stacked against them, and soon a winged shadow reigns over Lendria. It's then they learn the true price of victory: in order to tame the terrifying beast, Leena will have to sacrifice her own heart...and perhaps lose herself in the process. ";
        pages = 1050;
        imageurl = "https://i.gr-assets.com/images/S/compressed.photo.goodreads.com/books/1616142426l/45442055.jpg";
        seeall.add(new Books(name,author,imageurl,description,pages,id));




    }
}
