<a name="readme-top"></a>

# JlabsQA-Automation-Batch10

<!-- TABLE OF CONTENTS -->
<details>
  <summary>Table of Contents</summary>
  <ol>
    <li>
      <a href="#about-the-project">About The Project</a>
    </li>
    <li>
      <a href="#getting-started">Getting Started</a>
      <ul>
        <li><a href="#prerequisites">Prerequisites</a></li>
        <li><a href="#installation">Installation</a></li>
      </ul>
    </li>
      <li>
      <a href="#getting-started">Assignment</a>
      <ul>
        <li><a href="#tugas-1">Tugas 1</a></li>
        <li><a href="#tugas-2">Tugas 2</a></li>
         <li><a href="#tugas-3">Tugas 3</a></li>
        <li><a href="#tugas-4">Tugas 4</a></li>
         <li><a href="#tugas-5">Tugas 5</a></li>
        <li><a href="#tugas-6">Tugas 6</a></li>
        <li><a href="#tugas-7">Tugas 7</a></li>
      </ul>
    </li>
  </ol>
</details>

## About The Project

### Repo JlabsQA-Automation-Batch10

Repositori ini dibuat untuk menyimpan tugas - tugas dari kelas QA Automation Batch 10 Jakarta Labs

## Getting Started

### Prerequisites
```
Java 8+
Apache JMeter 5.5
```
### Installation
```
git clone https://github.com/alfahmist/JlabsQA-Automation-Batch10.git

```

## Assignment

<!-- Tugas 1 -->
### Tugas 1
Pada minggu pertama mempelajari fundamental java map/collection diberi tugas membuat Treemap dan Treeset dengan minimum 3 member.

TreeMap berfungsi menyimpan collection secara urut berdasarkan key dari value (key,value).

TreeSet berfungsi menyimpan collection secara urut berdasarkan value.

* Lokasi
```
tugas1/tree.java
```
* Code TreeSet:
```
int numbering;
System.out.println("TreeSet");
TreeSet<String> ts = new TreeSet<>();
ts.add("Lia");
ts.add("Lia");
ts.add("Arif");
ts.add("Felix");
ts.add("John");

numbering = 1;
for (String item : ts) {
  System.out.println(numbering + ". " + item);
  numbering++;
}

System.out.println("TreeSet First : " + ts.first());
System.out.println("TreeSet Last : " + ts.last());
```
* Output

![image](https://user-images.githubusercontent.com/48145002/183289838-0412bbb2-1f1c-4979-a5ea-2443b7e47ab9.png)


* Code TreeMap:
```
TreeMap<Integer, String> tm = new TreeMap<>();
tm.put(26, "Lia");
tm.put(26, "Doraemon");
tm.put(19, "Arif");
tm.put(8, "Felix");
tm.put(11, "Arif");

numbering = 1;
for (Integer key : tm.keySet()) {
  System.out.println(numbering + ". Favorite number of " + tm.get(key) + " is " + key);
  numbering++;
}

System.out.println("Lowest number : " + tm.firstKey());
System.out.println("Highest number : " + tm.lastKey());
```
* Output

![image](https://user-images.githubusercontent.com/48145002/183289510-901fb44a-f93b-40b7-a8ae-cb6bd2f74641.png)


* TreeMap dan TreeSet secara default mengurutkan secara ascending
* TreemSet tidak dapat menyimpan value duplikat, dia akan menyimpan value terakhir (paling baru)
* TreeMap tidak dapat menyimpan key duplikat, dia akan menyimpan key terakhir (paling baru), karena key pada treeset bersifat unique. sedangkan valuenya boleh duplikat.
* Perbedaan dari set dan map diatas, jika treeSet mengurutkan berdasarkan value dan treeMap mengurutkan berdasarkan key. 
<p align="right">(<a href="#readme-top">back to top</a>)</p>

<!-- Tugas 2-->
### Tugas 2

Pada minggu ke-2 mempelajari OOP (Object Oriented Programming).
Kami diberi tugas membuat calculator sederhana menggunakan OOP. dengan kondisi :
 kalau inputnya string, throw error kalo dia bukan angka.

saya membuatnya dengan flow berikut.

![image](https://user-images.githubusercontent.com/48145002/183291251-af9e56fb-ce4b-41cd-b796-52063168a550.png)


1. Memilih Menu.
2. Jika input nomor menunya tidak ada throw error input menu lagi.
3. Jika ada lanjut input angka
4. Input angka pertama dan kedua.
5. Apakah ada string atau tidak ?
6. Jika ada tipe data string throw error dan kembali input angka lagi.
7. jika tidak ada print hasil.

Untuk throw error nya saya bungkus dengan error handling yaitu try catch agar program dapat terus berjalan.

* Lokasi
```
tugas2/Calculator.java
tugas2/CalculatorMain.java
```

* Potongan Code :
```
void inputAngka() {
  try {
    Scanner inputValue1 = new Scanner(System.in);
    Scanner inputValue2 = new Scanner(System.in);
    System.out.print("Masukkan Angka pertama : ");
    String scan1 = inputValue1.next();
    System.out.print("Masukkan Angka Kedua : ");
    String scan2 = inputValue2.next();
    value1 = Integer.parseInt(scan1);
    value2 = Integer.parseInt(scan2);
  } catch (Exception e) {
    printError("Tidak bisa input string\n"); //throw error
    inputAngka(); // rekursif
  }
}

void printError(String message) {
  System.err.println(message);
}
```
* Output

![image](https://user-images.githubusercontent.com/48145002/183292026-3fea2591-16bc-448f-96cd-d7917c34bbed.png)

<p align="right">(<a href="#readme-top">back to top</a>)</p>

### Tugas 3
Pada tugas 3 mempelajari basic selenium, seperti :
1. mencari elemen
2. klik elemen
3. selenium wait (implicit , explicit)
4. setting driver (membuka browser, setting browser)


tugas 3 :
1. Go to yopmail.com
2. Input automationtest as email
3. Use switch iframe to get inbox content
4. Syso content of inbox

Pada tugas 3 diutamakan bagaimana cara untuk pindah iframe dari inbox ke mail.


![image](https://user-images.githubusercontent.com/48145002/183460142-79502342-b647-4170-a7c1-17234c43cb7e.png)

Flownya ketika sudah input username seperti ini

![image](https://user-images.githubusercontent.com/48145002/184048529-44e65bc6-89dd-48bc-b2a8-12253dc4d0a2.png)

1. klik button next sampai berada di halaman mail yang dicari ada.
2. Masuk frame ifinbox.
3. cari id email.
4. klik email.
5. Keluar ifinbox.
6. Masuk ke frame ifmail.
7. cari id text.
8. print text.


* Lokasi
```
tugas3
 ?????????tugas3.pages
 ???  ????????? BasePage.java    # Basic function (click, setText, getText)
 ???  ????????? InboxPage.java   # handle InboxPage (mailPage ,findMail, findText)
 ???  ????????? LoginPage.java   # Handle LoginPage input username (Login)
 ?????????tugas3.test 
    ????????? BaseTest.java   # congfiguration (Webdriver, BeforeTest and AfterTest)
    ????????? YopmMailTest.java  # main test
```

* Potongan Code
```
int pageNum = 3; // page keberapa ?
String username = "automationtest";
By mailID = By.xpath("//div[@id='e_ZwVjBQN3ZGpmZGH2ZQNjZmRkAmZ2ZD==']");
By mailTextID = By.xpath("//div[@id='mail']");


@Test
public void findMailTest() {
  // TODO Auto-generated method stub
  LoginPage loginPage = new LoginPage(driver);
  InboxPage InboxPage = new InboxPage(driver);

  loginPage.login(username);
  InboxPage.mailPage(pageNum);
  InboxPage.findMail(mailID);

  String actualText =	InboxPage.findText(mailTextID);
  String expectedText = "test automation";

  Assert.assertTrue((actualText).contains(expectedText));
  System.out.println(actualText);

  //		automationyopyop
  //		alt.nl-boh0w97y@yopmail.com
  // 		sendemail@yopmail.com
  // 		alt.sm-7opp81st@yopmail.com
	}
  
```

* Output


https://user-images.githubusercontent.com/48145002/183455201-8ba1ec02-2e12-4c3d-badd-e58b9b850ae2.mp4


<p align="right">(<a href="#readme-top">back to top</a>)</p>

### Tugas 4

pada tugas 4 mempelajari :
1. multithread
2. headless test
3. page object model

Tugas :
1. Go to saucedemo.com.
2. Input username and password.
3. Add 2 product.
4. Checkout and pay.
5. Please create all of this using POM.

* Lokasi
```
tugas4
 ?????????tugas4.pages
 ???  ????????? BasePage.java   # Basic function (click, setText, getText)
 ???  ????????? CartPage.java   # handle CartPage (click checkout button)
 ???  ????????? Checkout.java   # handle Checkout (fill customer information, click continue and finish button, getSuccessText)
 ???  ????????? Inventory.java  # handle Inventory (click an item button to add to cart)  
 ???  ????????? LoginPage.java  # handle Login (input username and password, click login button)            
 ?????????tugas4.test 
    ????????? BaseTest.java   # congfiguration (Webdriver, BeforeTest and AfterTest)
    ????????? SauceDemo.java  # main test
```
* flow login
1. input username
2. input password
3. klik button login

* flow inventory
1. masukkan id barang
2. klik button add to cart

* flow checkout
1. input nama
2. input alamat
3. input zip code
4. klik finish
5. klik continue

flow cartpage
1. klik checkout

* Potongan Code
```
@Test
public void checkoutTest() {

  loginPage.login(username, password);
  inventoryPage.buySomeItems();
  cartPage.checkout();
  checkoutPage.fillCustomerInformation(username, username, postalCode);

  String actualText = checkoutPage.getSuccessText();
  String expectedText = "THANK YOU FOR YOUR ORDER";

  Assert.assertTrue((actualText).contains(expectedText));
  System.out.println(actualText);
}
```
* Output

https://user-images.githubusercontent.com/48145002/183294083-9c84f900-967d-4002-b9ef-7fcbd8da52c4.mp4

<p align="right">(<a href="#readme-top">back to top</a>)</p>

### Tugas 5 

1. Find API to signup.
2. use user faker to create a dummy email, dummy name, and dummy phone number.
3. Assert to get 200OK.

Dependency yang dibutuhkan adalah Rest Assured.

* API Sign up
![image](https://user-images.githubusercontent.com/48145002/184049479-2f6a8b63-2831-4247-87f5-f40b6bfade1e.png)

ditemukan url untuk melakukan sign up 
yaitu : https://api-staging-builder.engineer.ai/users  
method : post  
untuk data json yang dibutukan ada di tab payload

![image](https://user-images.githubusercontent.com/48145002/184076916-91feaae6-4011-459b-a8d1-985b880612a9.png)

* Test lewat Postman
![image](https://user-images.githubusercontent.com/48145002/183471264-d0e1eee7-b18a-481f-a490-c1526199c7c6.png)

* User Faker
```
private void fakerTest() {
	Faker faker = new Faker();
	email = faker.internet().emailAddress();
	name = email.substring(0, email.indexOf('@')).replaceAll("\\.", " ");
	phoneNumber = faker.number().digits(11).toString();
	password = faker.internet().password(8,10);
	}
```

1. email didapatkan dari faker.internet().emailAddress()
2. nama didaptakan dari potongan email sebelum @
3. phonenumber didaptkan dari faker.number().digits(11).toString(); dengan panjang digit 11 lalu diubah tipedata string
4. password didapatkan dari faker.internet().password(8,10), dengan ketentuan minimal 8 karakter dan maksimal 10 karakter
* Lokasi
```
tugas4
 ?????????APITest.java
```
 * Potongan Code
 ```
public class APITest {

	String contentType = "application/json";
	String email;
	String name;
	String phoneNumber;
	String password;

	@Test
	void signUp() {

		RestAssured.baseURI = "https://api-staging-builder.engineer.ai";
		fakerTest();
		String payload = String.format("{\"user\":"
				+ "{\"email\":\"%s\","
				+ "\"first_name\":\"%s\","
				+ "\"phoneNumber\":\"%s\","
				+ "\"password\":\"%s\"}}", email, name, phoneNumber, password);

		Response responseSignUp = RestAssured.given().contentType(contentType).body(payload).when()
				.post("/users");
		assertEquals(responseSignUp.statusCode(), 200);
		System.out.println("Hasil : " + responseSignUp.statusCode());

	}

	private void fakerTest() {
		Faker faker = new Faker();
		email = faker.internet().emailAddress();
		name = email.substring(0, email.indexOf('@')).replaceAll("\\.", " ");
		phoneNumber = faker.number().digits(11).toString();
		password = faker.internet().password(8,10);

		System.out.println(email);
		System.out.println(name);
		System.out.println(phoneNumber);
		System.out.println(password);
	}
}

 ```
 
 * Output

![image](https://user-images.githubusercontent.com/48145002/184052423-0c2ffdd1-f1aa-40df-97fb-1e01a7a4fea3.png)


<p align="right">(<a href="#readme-top">back to top</a>)</p>

### Tugas 6

1. Create readme.md for all your assignment
2. Create a repository that contains all your assignment
3. Add andromedasiddhik or cupidline as collaborator
4. To get a full marks must be uploaded in 12 Agustus 2022

* Github Link

```
https://github.com/alfahmist/JlabsQA-Automation-Batch10/
```

<p align="right">(<a href="#readme-top">back to top</a>)</p>

### Tugas 7

Loadtest digunakan untuk menguji performance sistem, mensimulasikan reaksi server ketika banyak user yang mengakses.

Loadtest berada di level blackbox testing

Upload .jmx ke repository tugas yang berisi
1. Simple load test
2. Data driven load test
3. GraphQL load test
4. Spike load test
Database loadtest

* Lokasi
```
tugas7
 ?????????JlabsJemeter.jmx
``` 
Untuk membuka filenya membutuhkan Apache JMeter 5.5

* Capture Apache JMeter
![image](https://user-images.githubusercontent.com/48145002/184054213-7b56e2a6-c64d-44cb-a761-851fedb8ebe3.png)


<p align="right">(<a href="#readme-top">back to top</a>)</p>
