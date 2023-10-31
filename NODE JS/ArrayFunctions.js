countries=["India","US","South Korea","Australia","Japan"]
capitals=["NewDelhi","Washington","Seoul","Canbera","Tokyo"]

function getCapitals(country)
{
    for (i in countries){
        if (countries[i] == country)
        return capitals[i];
    }
    return"Country does not exist";
}

module.exports.getCapCity=getCapitals;