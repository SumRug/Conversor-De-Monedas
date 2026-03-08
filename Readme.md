# Currency Converter (Java)

A command-line currency converter built with **Java** that retrieves real-time exchange rates from an external API.
The application allows users to convert values between multiple currencies and records each conversion with the exact date and time in a JSON file.

---

# Overview

This application performs currency conversions using up-to-date exchange rates obtained through an external API.
Users can choose predefined conversions or specify their own currency codes to perform custom conversions.

Each conversion performed by the user is stored in a JSON file, including the base currency, target currency, amount converted, result, and the date and time when the conversion occurred.

---

# Features

* Convert **Mexican Peso (MXN)** to:

  * US Dollar (USD)
  * Euro (EUR)
  * British Pound (GBP)

* Convert the following currencies to **MXN**:

  * USD
  * EUR
  * GBP

* Perform custom currency conversions using international currency codes

* Automatic recording of each conversion with:

  * base currency
  * target currency
  * converted amount
  * result
  * timestamp

* Storage of conversion history in JSON format

---

# Technologies

The application uses the following technologies:

* **Java**
* **Java HTTP Client**
* **Gson** for JSON processing
* **ExchangeRate API** for retrieving exchange rates

---

# Installation

Clone the repository:

```bash
git clone https://github.com/yourusername/currency-converter.git
```

Navigate to the project directory:

```bash
cd currency-converter
```

Compile the project:

```bash
javac *.java
```

Run the application:

```bash
java Principal
```

---

# Usage

When the application starts, a menu appears allowing the user to select a currency conversion option.

Example menu:

```
1: MXN → USD
2: MXN → EUR
3: MXN → GBP
4: USD → MXN
5: EUR → MXN
6: GBP → MXN
7: Custom conversion
8: Exit
```

After selecting an option, the user enters the amount to convert.
The program retrieves the exchange rate from the API and displays the conversion result.

---

# Example Output

```
Enter amount to convert:
100

100 MXN = 5.87 USD

Conversion date:
08/03/2026 19:42:10
```

---

# Conversion History

Every conversion performed is stored automatically in a file named:

```
historial.json
```

Example entry:

```json
{
  "fecha": "08/03/2026 19:42:10",
  "monedaBase": "MXN",
  "monedaObjetivo": "USD",
  "monto": 100.0,
  "conversion": 5.87
}
```


