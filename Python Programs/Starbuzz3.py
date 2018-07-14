import urllib.request

page = urllib.request.urlopen("http://www.beans-r-us.biz/prices-loyalty.html")
text = page.read().decode("utf8")
pos = text.find(">$")
start_of_price = pos + 2
end_of_price = pos + 6
price=text[start_of_price:end_of_price]
print(price)
