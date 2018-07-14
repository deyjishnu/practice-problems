import urllib.request
import time

def get_price():
    page = urllib.request.urlopen("http://www.beans-r-us.biz/prices-loyalty.html")
    text = page.read().decode("utf8")
    pos = text.find(">$")
    start_of_price = pos + 2
    end_of_price = pos + 6
    return(text[start_of_price:end_of_price])

choice = input("Do you want to know the price immediately (Y/N)?")
if choice == "Y":
    print(get_price())
else:
    price = 99.99
    while price > 4.74:
        time.sleep(900)
        price = float(get_price())
    print("Buy !")
