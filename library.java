package tugasperpus;

public class library {
        public String[][] Filsafat = {
            { "Republic", "Plato", "c. 380 BC" },
            { "Critique of Pure Reason", "Immanuel Kant", "1781" },
            { "Beyond Good and Evil", "Friedrich Nietzsche", "1886" },
            { "The Stranger", "Albert Camus", "1942" },
            { "A History of Western Philosophy", "Bertrand Russell", "1945" }

        };

        public String[][] Teknologi = {
            { "Hackers: Heroes of the Computer Revolution", "Steven Levy", "1984" },
            { "The Singularity Is Near: When Humans Transcend Biology", "Ray Kurzweil", "2005" },
            { "The Second Machine Age: Work, Progress, and Prosperity in a Time of Brilliant Technologies",
                "Erik Brynjolfsson and Andrew McAfee", "2014" },
            { "Life 3.0: Being Human in the Age of Artificial Intelligence", "Max Tegmark", "2017" },
            { "The Fourth Industrial Revolution", "Klaus Schwab", "2016" }
        };
        public String[][] Agama = {
            { "The Dhammapada", "(Buddhist scripture)" },
            { "The Book of Mormon", "(Latter-day Saint scripture)" },
            { "The Confessions", "Saint Augustine", "397-398 AD" },
            { "The Analects", "Confucius", "Compiled around 4th century BC" },
            { "The Varieties of Religious Experience", "William James", "1902" }
        };

        public String[][] Sejarah = {
                { "The Rise and Fall of the Third Reich: A History of Nazi Germany", "William L. Shirer", "1960" },
                { "A Short History of Nearly Everything", "Bill Bryson", "2003" },
                { "A People's Tragedy: The Russian Revolution: 1891-1924", "Orlando Figes", "1996" },
                { "The Crusades: The Authoritative History of the War for the Holy Land", "Thomas Asbridge", "2010" },
                { "The Devil in the White City: Murder, Magic, and Madness at the Fair That Changed America", "Erik Larson", "2003" }
            };
        

        public String[][] Psikologi = {

            { "Influence: The Psychology of Persuasion", "Robert B. Cialdini", "1984" },
            { "Blink: The Power of Thinking Without Thinking", "Malcolm Gladwell", "2005" },
            { "The Man Who Mistook His Wife for a Hat and Other Clinical Tales", "Oliver Sacks", "1985" },
            { "Drive: The Surprising Truth About What Motivates Us", "Daniel H. Pink", "2009" },
            { "The Art of Happiness", "Dalai Lama XIV and Howard Cutler", "1998" }
    
        };

        public String[][] Politik = {
            { "Capital in the Twenty-First Century", "Thomas Piketty", "2013" },
            { "The Shock Doctrine: The Rise of Disaster Capitalism", "Naomi Klein", "2007" },
            { "The Clash of Civilizations and the Remaking of World Order", "Samuel P. Huntington", "1996" },
            { "Manufacturing Consent: The Political Economy of the Mass Media", "Edward S. Herman and Noam Chomsky", "1988" },
            { "The New Jim Crow: Mass Incarceration in the Age of Colorblindness", "Michelle Alexander", "2010" }
        };

        public String[][] Fiksi = {
            { "Crime and Punishment", "Fyodor Dostoevsky", "1866" },
            { "One Hundred Years of Solitude", "Gabriel García Márquez", "1967" },
            { "The Great Gatsby", "F. Scott Fitzgerald", "1925" },
            { "Pride and Prejudice", "Jane Austen", "1813" },
            { "The Catcher in the Rye", "J.D. Salinger", "1951" }
        };

        public String getInformasiBuku(int kode) {
                String informasi = "";

                if (kode == 1) {
                        informasi = "Kategori: Filsafat\n";
                        informasi += "----------------------\n";
                        for (String[] buku : Filsafat) {
                                informasi += "Judul\t\t: " + buku[0] + "\n";
                                informasi += "Pengarang\t: " + buku[1] + "\n";
                                informasi += "tahun pembuatan\t: " + buku[2] + "\n\n";
                        }
                } else if (kode == 2) {
                        informasi = "Kategori: Teknologi\n";
                        informasi += "----------------------\n";
                        for (String[] buku : Teknologi) {
                                informasi += "Judul\t\t: " + buku[0] + "\n";
                                informasi += "Pengarang\t: " + buku[1] + "\n";
                                informasi += "Tahun Pembuatant: " + buku[2] + "\n\n";
                        }
                } else if (kode == 3) {
                        informasi = "Kategori: Sejarah\n";
                        informasi += "----------------------\n";
                        for (String[] buku : Sejarah) {
                                informasi += "Judul\t: " + buku[0] + "\n";
                                informasi += "Pengarang\t: " + buku[1] + "\n";
                                informasi += "Tahun pembuatan \t: " + buku[2] + "\n";
                        }
                } else if (kode == 4) {
                        informasi = "Kategori: Agama\n";
                        informasi += "----------------------\n";
                        for (String[] buku : Agama) {
                                informasi += "Judul\t: " + buku[0] + "\n";
                                informasi += "Pengarang\t: " + buku[1] + "\n";
                                informasi += "Tahun pembuatan\t: " + buku[2] + "\n";
                        }
                } else if (kode == 5) {
                        informasi = "Kategori: Psikologi\n";
                        informasi += "----------------------\n";
                        for (String[] buku : Psikologi) {
                                informasi += "Judul\t\t: " + buku[0] + "\n";
                                informasi += "Pengarang\t: " + buku[1] + "\n";
                                informasi += "Tahun Pembuatan\t: " + buku[2] + "\n\n";
                        }
                } else if (kode == 6) {
                        informasi = "Kategori: Politik\n";
                        informasi += "----------------------\n";
                        for (String[] buku : Politik) {
                                informasi += "Judul\t\t: " + buku[0] + "\n";
                                informasi += "Pengarang\t: " + buku[1] + "\n";
                                informasi += "Tahun Pembuatan\t: " + buku[2] + "\n\n";
                        }
                } else if (kode == 7) {
                        informasi = "Kategori: Fiksi\n";
                        informasi += "----------------------\n";
                        for (String[] buku : Fiksi) {
                                informasi += "Judul\t\t: " + buku[0] + "\n";
                                informasi += "Pengarang\t: " + buku[1] + "\n";
                                informasi += "Tahun Pembuatan\t: " + buku[2] + "\n\n";
                        }
                } else {
                        informasi = "Kode buku tidak valid.";
                }
                return informasi;
        }
    }   